package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*-----
 * tells to spring  frame work that this object should be 
 * created and managed by spring framework
 * 
 * it is equavalent to writing bean id in .xml file
 * */
@Component
public class Coder {
	
	/*
	 *  insted of we creating object manualy autowired is used 
	 *  */
	@Autowired
	Laptop hp;
	
	void code()
	{
		
		System.out.println("coding ..........");
		hp.complie();
	}
}
