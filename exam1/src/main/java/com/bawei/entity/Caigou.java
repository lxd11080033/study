/**
 * Create Date:2019年3月5日
 */
package com.bawei.entity;

import java.util.Date;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年3月5日
 */
public class Caigou {

  private int id;
  private String hang;//行业
  private String chan;//产品
  private String di;//地址
  private Date time ;//
  private String name;//名字
  private int cid;//行业编号
  /**
   * @return the id
   */
  public int getId() {
    return id;
  }
  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }
  /**
   * @return the hang
   */
  public String getHang() {
    return hang;
  }
  /**
   * @param hang the hang to set
   */
  public void setHang(String hang) {
    this.hang = hang;
  }
  /**
   * @return the chan
   */
  public String getChan() {
    return chan;
  }
  /**
   * @param chan the chan to set
   */
  public void setChan(String chan) {
    this.chan = chan;
  }
  /**
   * @return the di
   */
  public String getDi() {
    return di;
  }
  /**
   * @param di the di to set
   */
  public void setDi(String di) {
    this.di = di;
  }
  /**
   * @return the time
   */
  public Date getTime() {
    return time;
  }
  /**
   * @param time the time to set
   */
  public void setTime(Date time) {
    this.time = time;
  }
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
  /**
   * @return the cid
   */
  public int getCid() {
    return cid;
  }
  /**
   * @param cid the cid to set
   */
  public void setCid(int cid) {
    this.cid = cid;
  }
  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年3月5日
   * @param id
   * @param hang
   * @param chan
   * @param di
   * @param time
   * @param name
   * @param cid
   */
  public Caigou(int id, String hang, String chan, String di, Date time, String name, int cid) {
    super();
    this.id = id;
    this.hang = hang;
    this.chan = chan;
    this.di = di;
    this.time = time;
    this.name = name;
    this.cid = cid;
  }
  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年3月5日
   */
  public Caigou() {
    super();
    // TODO Auto-generated constructor stub
  }
  /**
   * <br>Description:TODO 方法功能描述
   * <br>Author:胡正林(823865618@qq.com)
   * <br>Date:2019年3月5日
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Caigou [id=" + id + ", hang=" + hang + ", chan=" + chan + ", di=" + di + ", time=" + time
      + ", name=" + name + ", cid=" + cid + "]";
  }
  
  
  
  
}
