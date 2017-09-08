package com.shimh.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * *****************************************************************
 * Created on 2017年9月1日 上午10:08:55
 * @author shimh 
 * 	
 * 	测试 SpringMVC整合FreeMark视图
 *	
 *    
 * 
 * Update: ------ empty log ------
 ******************************************************************
 */
@Controller
@RequestMapping(value="/freemark")
public class FreeMarkController {

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(Model model){
		
		model.addAttribute("name", "史明辉");
		
		return "index";
	}
}
