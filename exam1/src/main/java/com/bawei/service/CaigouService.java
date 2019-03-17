/**
 * Create Date:2019年3月5日
 */
package com.bawei.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.entity.Caigou;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年3月5日
 */
public interface CaigouService {

  public List<Caigou> list(@Param("name")String name,@Param("min")String min,@Param("max")String max,@Param("cid")String cid);

}
