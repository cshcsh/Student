package com.java5200.util;

/**
 * StringUtil
 * @author CSH
 * @date 2018��7��16������3:25:31
 */
public class StringUtil {

	//�ַ���Ϊ��
	public static boolean isEmpty(String str){
		if("".equals(str)|| str==null){
			return true;
		}else{
			return false;
		}
	}
	
	//�ַ�����Ϊ��
	public static boolean isNotEmpty(String str){
		if(!"".equals(str)&&str!=null){
			return true;
		}else{
			return false;
		}
	}
}
