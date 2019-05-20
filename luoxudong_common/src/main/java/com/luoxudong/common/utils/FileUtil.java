/**
 * Create Date:2019年5月20日
 *
 */
package com.luoxudong.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 文件工具类
*/
public class FileUtil {
  
 
  /*
  * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
  */
  public static String getExtendName(String fileName){
    int indexOf = fileName.indexOf(".");
    String name=fileName.substring(indexOf);
    
    return name;
 
    
  }
  /*
  * 方法2：返回操作系统临时目录(5分)
  */
  public static String getTempDirectory(){
    
 String path=System.getProperty("java.io.tepdir");
    
    return path;
 
  }
  /*
  * 方法3：返回操作系统用户目录(5分)
  * 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
  */
  public static String getUserDirectory(){
String path=System.getProperty("user.home");
    
    return path;
    
    
  }


  
  
  
  
}
