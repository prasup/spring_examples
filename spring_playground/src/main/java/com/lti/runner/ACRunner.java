package com.lti.runner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.lti.model.TestBean;

public class ACRunner {

	public static void main(String[] args)
	{
		System.out.println("Before loading the Application context");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("After loading the Application Context");
		
		System.out.println("Loading the bean....");
		TestBean t=ctx.getBean("tBean",TestBean.class);
		System.out.println("After loading the bean");
		System.out.println("Bean Loaded");

	}

}
