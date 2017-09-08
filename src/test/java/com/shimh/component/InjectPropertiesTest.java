package com.shimh.component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

/**
 * *****************************************************************
 * Created on 2017年9月1日 上午10:08:55
 * @author shimh 
 * 	
 * 	测试属性配置
 *	
 *    
 * 
 * Update: ------ empty log ------
 ******************************************************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InjectPropertiesTest  {
	
	@Autowired
	private InjectProperties prop;
	
	@Test
	public void contextLoads() {
		
		System.out.println(prop.toString());
		//Assert.assertEquals("报错了","shiminghui", prop.getName());
	}
}
