package com.coder.springcoredemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	/*------
    	 * add spring context  maven dependency in pom.xml 
    	 * to use this bean factory class and getbean method
    	 * 
    	 * 
    	 * to use getbean method we need factory class i.e beanfactory
    	 * 
    	 * bean factory is created use .xml file  
    	 * which containes details regarding objects to be created and managed
    	 * 
    	 * --- */
    	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Coder  coder=(Coder) factory.getBean("coder");
        coder.code();
        
    }
}
