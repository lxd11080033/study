package com.luoxudong.common.utils;

import java.io.InputStream;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

public class WebUtil {

	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public String getString(HttpServletRequest request, String name, String defaultValue){
	    //实现代码
		String str = request.getParameter(name);
		if(null==str) {
			return defaultValue;
		}
		return str;
	}
	//获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(HttpServletRequest request, String name,int defaultValue){
	    //实现代码
		
		String str = request.getParameter(name);
		if(str==null)
			return defaultValue;
		return Integer.parseInt(str);
		
	}
	
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
		  String param = request.getQueryString();
		  
	    //实现代码
		String uri = request.getRequestURI()+"?"+param;
		return uri;
	}
	//判断网址能否打开
	public static boolean isHttpUrl(String param) {
    URL url;  
    try {  
          url = new URL(param);  
          InputStream in = url.openStream();  
          return true; 
     } catch (Exception e1) {  
          System.out.println("不是正确网站!");  
          url = null;  
     }  
    return false;
   
 }

}
