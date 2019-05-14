/**
 * Create Date:2019年5月14日
 *
 */
package lx;

public class Employee {
  
private Integer id;
private String name;
private double d;

public Integer getId() {
  return id;
}
public void setId(Integer id) {
  this.id = id;
}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public double getD() {
  return d;
}
public void setD(double d) {
  this.d = d;
}
public Employee() {
  super();
  // TODO Auto-generated constructor stub
}
public Employee( String name, Integer id,double d) {
  super();
  this.id = id;
  this.name = name;
  this.d = d;
}




}
