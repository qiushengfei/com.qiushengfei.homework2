package com.bawei.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bawei.entity.Premium;
import com.bawei.service.PremiumService;

@Controller
public class premiumController {

	public static int getPercent(int current, int total){
		//TODO 实现代码
			int i = (current*100)/total;
			
			return  i;
		}
	
	@Autowired
	private PremiumService premiumService;
	@RequestMapping("list")
	public String list(Model model,Integer id) {
		
	 List<Premium> list= premiumService.list(id);		
	 System.out.println(list);
	 Integer i=0;
	 List<Integer> avg = new ArrayList<>();
	 for (Premium premium : list) {
		 i+= premium.getVotes();
		 avg.add(premium.getVotes());
		 
	}
	 for (Premium premium : list) {
		 premium.setBfb(String.valueOf(premiumController.getPercent(premium.getVotes(),i))+"%"); 	 
	}
	 model.addAttribute("list",list);
	 model.addAttribute("i",i);
		
  if(id!=null) {
	  return "list2";
	}
	return "list";
}
	@GetMapping("toupdate")
	public String toupdate(Model model,Integer id) {
	 Premium  p =	premiumService.selectById(id);
	 List<Premium> list = premiumService.option();
	 model.addAttribute("list",list);
	 model.addAttribute("p",p);
	return  "update";
	}
	@PostMapping("update")
	public String update(Premium p,Model model){
		System.out.println("+++++++++++++++++++++++++"+p);
		premiumService.update(p);
		//取值  看是不是二 是二 
		  String i=p.getTid();
		if(i.equals("2")) {
			return "redirect:list?id=2";
		}
		
	return "redirect:list";
	}
	
	
}