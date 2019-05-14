/**
 * Create Date:2019年5月14日
 *
 */
package lx;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class My {
  
   List<Employee> list =Arrays.asList(
      new Employee("张三", 18,8000.8 ),
      new Employee("李四", 19,7000.7 ),
      new Employee("王五", 17,5000.5 ),
      new Employee("赵六", 20,7500.6 )
      );
  @Test
  public void test() {
   
    System.out.println("sas");
  }
  @Test
  public void tes1() {
   Comparator<Employee> comparator = new Comparator<Employee>() {

    public int compare(Employee o1, Employee o2) {
      // TODO Auto-generated method stub
      return (int) (o1.getD()-o2.getD());
    }
  };
    
    Collections.sort(list,comparator);
    System.out.println(list);
  }
  @Test
  public void test2() {
    Comparator<Employee> comparator=(o1,o2)->-(o1.getId()-o2.getId());
    
    List<Employee> elist=myFilter(List<Employee> list,Myinterface<Employee> u ){
      
    }
    
    for(Employee e:list) {
      if(my.test(e)) {
        elist.add(e);
      }
      
      
    }
    
  }
  

}
