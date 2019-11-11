package com.lti.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.A;
import com.lti.model.B;
import com.lti.model.C;
import com.lti.model.E;

public class Application {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*B b=(B) ctx.getBean("b");
		System.out.println(b.getText());
		
		B b1=ctx.getBean("b",B.class);
		System.out.println("Loaded without casting:"+b1.getText());
		
		A a=ctx.getBean("a",A.class);
		System.out.println("value retrieved from object of A"+a.getB().getText());*/
		
		C c= ctx.getBean("c", C.class);
		System.out.println(c);
		
		C c1= ctx.getBean("c1", C.class);
		System.out.println(c1);
		
		C c2= ctx.getBean("c2", C.class);
		System.out.println(c2);
		
		E e1=ctx.getBean("e",E.class);
		System.out.println(e1);
	}

}
