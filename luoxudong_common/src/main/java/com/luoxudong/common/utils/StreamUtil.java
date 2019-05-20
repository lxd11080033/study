/**
 * Create Date:2019年5月20日
 *
 */
package com.luoxudong.common.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 流工具类
*/
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class StreamUtil {

  /*
  * 方法1：批量关闭流，参数能传无限个。(3分)
  * 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
  */
  public static void closeAll(IOUtils io) {
   
    if(io!=null) {}
    
  }
  /*
  * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
  */
 
  public static void readTextFile(File src,File desc) throws IOException{
   
    FileInputStream in = new FileInputStream(src);
      FileOutputStream out = new FileOutputStream(desc);
      int c;
      while((c=in.read())!=-1) {
        out.write(c);
        out.flush();
      }
      closeAll(null);
      
    
  }
  /*
  * 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
  */
  public static String readTextFile(File txtFile) throws IOException{
    FileInputStream in = new FileInputStream(txtFile);
    String out =null;
    int c;
    while((c=in.read())!=-1) {
      
    }
    
    
    return "";
  
    
    
    
    
  }

  
  
}
