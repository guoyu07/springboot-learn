package com.shimh.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * *****************************************************************
 * Created on 2017年9月1日 上午10:08:55
 * @author shimh 
 * 	
 * 	属性配置类
 *	
 *    
 * 
 * Update: ------ empty log ------
 ******************************************************************
 */
@Component
//@ConfigurationProperties(prefix = "com.shimh") 自动寻找com.shimh前缀的属性，不用@Value
public class InjectProperties  {
	
	@Value("${com.shimh.name}")
	private String name;
	
	@Value("${com.shimh.age}")
	private int age;
	
	//RandomValuePropertySource 生成随机字符串
	@Value("${com.shimh.randomString}")
	private String randomString;
	
	//测试多环境配置 dev test com.shimh.env = dev
	@Value("${com.shimh.env}")
	private String env;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRandomString() {
		return randomString;
	}

	public void setRandomString(String randomString) {
		this.randomString = randomString;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	@Override
	public String toString() {
		return "InjectProperties [name=" + name + ", age=" + age + ", randomString=" + randomString + ", env=" + env
				+ "]";
	}

	
	
}
