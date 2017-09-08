package com.shimh.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *****************************************************************
 * Created on 2017年9月1日 上午10:08:55
 * @author shimh 
 * 	
 * 	测试web访问 http://localhost:8080/hello
 *	
 *    
 * 
 * Update: ------ empty log ------
 ******************************************************************
 */
@RestController
public class HelloController {

	
	@RequestMapping("/hello")
	public String index(){
		return "Hello World";
	}
	
	@RequestMapping("/testerror")
	public String error() throws Exception{
		throw new Exception("测试异常");
	}
	
}
