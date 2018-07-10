<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<script type="text/javascript">
	function resetValue() {
		document.getElementById("userName").value = "";
		document.getElementById("password").value = "";
	}
</script>
</head>
<body>

	<div align="center" style="margin-top: 200px; margin-left: 30%; margin-right: 30%;">
		<form action="login" method="post">
			<table bgcolor="3CA992">
				<tr height="60">
					<td colspan="4"></td>
				</tr>
				<tr height="20">
					<td width="25%"></td>
					<td colspan="2" align="center"><font size="5" color="FFFFFF">用户登录</font></td>
					<td width="25%"></td>
				</tr>
				<tr height="30">
					<td width="25%"></td>
					<td colspan="2"><hr color="FFFFFF"></td>
					<td width="25%"></td>
				</tr>
				<tr height="15">
					<td width="25%"></td>
					<td colspan="2">用户名：<input style="height: 20px;" type="text"
						value="${userName }" name="userName" id="userName" /></td>
					<td width="25%"></td>
				</tr>
				<tr height="15">
					<td width="25%"></td>
					<td colspan="2">密&nbsp&nbsp码：<input style="height: 20px"
						type="password" value="${password }" name="password" id="password" /></td>
					<td width="25%"></td>
				</tr>
				<tr height="20">
					<td colspan="4"><font color="red">${error }</font></td>
				</tr>
				<tr height="15">
					<td width="25%"></td>
					<td width="25%" align="left"><input
						style="width: 70px; height: 25px" type="submit" value="登录" /></td>
					<td width="25%" align="right"><input
						style="width: 70px; height: 25px" type="button" value="重置"
						onclick="resetValue()" /></td>
					<td width="25%"></td>
				</tr>
				<tr height="45">
					<td colspan="4"></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>