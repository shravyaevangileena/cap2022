package com.demo.pojo;

public class Message {
	public void init() throws Exception {
		System.out.println("Bean HelloWorld has been " + "instantiated and I'm " + "the init() method");
	}

	// This method executes
	// when the spring container
	// is closed
	public void destroy() throws Exception {
		System.out.println("Container has been closed " + "and I'm the destroy() method");
	}
}
