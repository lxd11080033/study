/**
 * Create Date:2019年5月20日
 *
 */
package com.luoxudong.common.utils;
/**
 * 时间工具类
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtile {
  /*
  * 方法1：(5分)
  * 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
  * 则返回的结果为2019-05-01 00:00:00
  */
  
  
  
  
  public static String getDateByInitMonth(String src) throws ParseException{
    
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Date date = sf.parse(src);
    Calendar c = getCalendar(src);
    c.set(Calendar.DAY_OF_MONTH, 1);
    Date date2 = c.getTime();
    
    return sf.format(date2);

              
  }

private static Calendar getCalendar(String src) throws ParseException {
  // TODO Auto-generated method stub
  SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
  Date date = sf.parse(src);
  Calendar c = Calendar.getInstance();
 c.setTime(date);
  
  return c;
  
  
}
 
  
  
  
  
  
}
