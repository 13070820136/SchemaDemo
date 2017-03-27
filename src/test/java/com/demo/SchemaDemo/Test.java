package com.demo.SchemaDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.schema.UserBean;


public class Test {
	@org.junit.Test
	public void test(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserBean user = (UserBean) context.getBean("eric");
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getSex());
        System.out.println(user.getAge());
	}
}
