package com.java5200.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java5200.dao.UserDao;
import com.java5200.model.User;
import com.java5200.util.DbUtil;
import com.java5200.util.StringUtil;

/**
 * LoginServlet
 * @author CSH
 * @date 2018年7月16日下午3:12:47
 */
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	DbUtil dbUtil=new DbUtil();
	UserDao userDao=new UserDao();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
		req.setAttribute("userName", userName);
		req.setAttribute("password", password);
		if(StringUtil.isEmpty(userName)||StringUtil.isEmpty(password)){
			req.setAttribute("error", "用户名或密码为空！");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			return;
		}
		User user=new User(userName, password);
		Connection connection=null;
		try {
			connection=dbUtil.getConnection();
			try {
				User currentUser=userDao.login(connection, user);
				if(currentUser==null){
					req.setAttribute("error", "用户名或密码错误！");
					req.getRequestDispatcher("login.jsp").forward(req, resp);
				}else{
					HttpSession session=req.getSession();
					session.setAttribute("currentUser", currentUser);
					resp.sendRedirect("main.jsp");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				dbUtil.closeConnetion(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
}
