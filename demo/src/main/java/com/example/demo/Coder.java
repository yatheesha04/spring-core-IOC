package com.example.demo;

import org.springframework.stereotype.Component;

/*-----
 * tells to spring  frame work that this object should be 
 * created and managed by spring framework
 * 
 * it is equavalent to writing bean id in .xml file
 * */
@Component
public class Coder {
	void code()
	{
		System.out.println("coding ..........");
	}
}
