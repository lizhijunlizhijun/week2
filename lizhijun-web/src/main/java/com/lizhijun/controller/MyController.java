package com.lizhijun.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lizhijun.bean.Meet;
import com.lizhijun.bean.Type;
import com.lizhijun.service.MeetService;

@Controller
public class MyController {

	@Resource
	private MeetService  meetService;
	
	@RequestMapping("queryMeet")
	private String findAll(@RequestParam(defaultValue="1")Integer pageNum
			,Model model){
		Map<String, Object> map = new HashMap<String, Object>();

		PageHelper.startPage(pageNum, 2);
		
		List<Meet> list = meetService.queryMeet(map);
		
		PageInfo<Meet> page = new PageInfo<Meet>(list);
		
		model.addAttribute("page",page);
		
		return "Meet_list";
	}
	
	@RequestMapping("queryType")
	public List<Type> queryType(){
		List<Type> queryType = meetService.queryType();
		
		return queryType;
	}
	
	@RequestMapping("addMeet")
	@ResponseBody
	public boolean add(Model model,Meet meet){
		try {
			meetService.addMeet(meet);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	@RequestMapping("queryType")
	public String huixian(Model model,Integer mid){
		Meet meet = meetService.huiMeet(mid);
		model.addAttribute("meet", meet);
		return  "update";
	}
	
	@RequestMapping("updateMeet")
	@ResponseBody
	public boolean update(Model model,Meet meet){
		try {
			meetService.updateMeet(meet);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
}
