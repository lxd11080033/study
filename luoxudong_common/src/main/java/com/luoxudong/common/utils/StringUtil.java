package com.luoxudong.common.utils;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {

	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static  boolean hasLength(String src){
		
		return src!=null && src.length()>0;
		
		
	    //实现代码
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src){
		return src!=null && src.trim().length()>0;
	}
	//方法3：判断是否为手机号码 (5分)
	public static boolean isMobile(String src){
		String str ="^1[3456789]\\d{9}$";
		return src.matches(str);
		
	    //实现代码
	}
	//方法4：判断是否为邮箱 (5分)
	public static  boolean isEmail(String src){
		//String str="([\\.a-zA-Z0-9_-]+)@([a-zA-Z0-9_-]+)(\\.[a-zA-Z0-9_-]+)";
		String str="(\\w+@\\w+\\.(com|cn))";
		return src.matches(str);
	    //实现代码
	}
	//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public static String reverse(String src){
     	return 	StringUtils.reverse(src);
	    //实现代码
	}
	public static void main(String[] args) {
		String src=" ";
		boolean b = hasLength(src);
		System.out.println(b);
		boolean email = isEmail("number@163.com");
		System.out.println(email);
	}
}
