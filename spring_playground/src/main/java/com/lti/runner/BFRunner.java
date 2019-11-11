package com.lti.runner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.lti.model.TestBean;

public class BFRunner {

	public static void main(String[] args) 
	{
		System.out.println("Before loading the bean factory");
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		System.out.println("After loading the bean factory");
		
		System.out.println("Loading the bean....");
		TestBean t=factory.getBean("tBean",TestBean.class);
		System.out.println("After loading the bean");
		System.out.println("Bean Loaded");
	}

}
