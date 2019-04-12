package com.osf.sp.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("ioc1/ioc.xml");
		Student s= (Student)ac.getBean("s");
		System.out.println(s);
	}
}
