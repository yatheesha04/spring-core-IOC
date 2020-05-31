package com.example.demo;

import java.io.ObjectInputStream.GetField;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		/*
		 * run method give appliction context , which is used to get requred bean class
		 */
		ApplicationContext factory =SpringApplication.run(DemoApplication.class, args);
		Coder obj=factory.getBean(Coder.class);
		obj.code();
	}

}
