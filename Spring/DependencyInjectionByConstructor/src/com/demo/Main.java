package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.Message;

	public class Main {

		public static void main(String[] args) {
			ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");//created spring container to instantiate object
			
			Message message = (Message) applicationContext.getBean("mymessage");
		    
			message.show();//called without created object   //this is my user defined method
		}

	}


