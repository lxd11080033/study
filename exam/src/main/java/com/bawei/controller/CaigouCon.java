/**
 * Create Date:2019年3月5日
 */
package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.entity.Caigou;
import com.bawei.service.CaigouService;


@Controller

public class CaigouCon {
@Autowired
  private CaigouService cs;

@RequestMapping("list.do")
public String list(String name, String min, String max, String cid,Model m) {
  
  
  List<Caigou> list=cs.list(name, min, max, cid);
  m.addAttribute("list", list);
  m.addAttribute("name", name);
  m.addAttribute("min", min);
  m.addAttribute("max", max);
  m.addAttribute("cid", cid);
  return "forward:list.jsp";
  
}




}
