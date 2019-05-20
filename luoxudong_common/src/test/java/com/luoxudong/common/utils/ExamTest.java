/**
 * Create Date:2019年5月20日
 *
 */
package com.luoxudong.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.ss.usermodel.DateUtil;
import org.junit.Test;

public class ExamTest {

  @Test
  public void testDate() throws ParseException {
    String sql = "select * from t_order where create_time>='' and create_time<='{2}' ";
    String str = DateUtile.getDateByInitMonth("2012/3/4");
    System.out.println(str);
   
    
    
    
    
  }
  
  @Test
  public void testFile() {
    
    String name = FileUtil.getExtendName("abc.jpg");
   System.out.println(name);
   System.out.println(FileUtil.getTempDirectory());
   System.out.println(FileUtil.getUserDirectory());
    
    
  }
  
  @Test
  public void testIo() throws IOException {
   File src = new File("E:/abc.txt");
   File desc = new File("E:/abc.txt");
    StreamUtil.readTextFile(src,desc);
    String file = StreamUtil.readTextFile(src);
    System.out.println(file);
  }
  
  

}
