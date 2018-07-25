package com.java5200.util;

/**
 * StringUtil
 * @author CSH
 * @date 2018年7月16日下午3:25:31
 */
public class StringUtil {

	//字符串为空
	public static boolean isEmpty(String str){
		if("".equals(str)|| str==null){
			return true;
		}else{
			return false;
		}
	}
	
	//字符串不为空
	public static boolean isNotEmpty(String str){
		if(!"".equals(str)&&str!=null){
			return true;
		}else{
			return false;
		}
	}
}
