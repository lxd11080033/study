/**
 * Create Date:2019年3月5日
 */
package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.entity.Caigou;

public interface CaigouDao {

  public List<Caigou> list(@Param("name")String name,@Param("min")String min,@Param("max")String max,@Param("cid")String cid);

}
