package com.programming.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
       Alien obj = (Alien)factory.getBean("alien");
       obj.age=12;
       obj.code();
       System.out.println(obj.age);
       
       Alien obj1 = (Alien)factory.getBean("alien");
       
       obj1.code();
       System.out.println(obj1.age);
    }
}
