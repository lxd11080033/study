/**
 * Create Date:2019年3月5日
 */
package com.bawei.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bawei.dao.CaigouDao;
import com.bawei.entity.Caigou;

/**
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:胡正林(823865618@qq.com)
 * <br>Date:2019年3月5日
 */
@Service
@Transactional
public class CaigouServiceImpl implements CaigouService{
@Autowired
  private CaigouDao dao;
  @Override
  public List<Caigou> list(String name, String min, String max, String cid) {
    // TODO Auto-generated method stub
    return dao.list(name, min, max, cid);
  }

 
}
