package com.training.javaee.interceptor;

import javax.inject.Named;

@Named("hello")
public class Hello {
	
	@Logger
	public void printHello() {
		System.out.println("Hello World!");
	}

	public void printOk() {
		System.out.println("Ok!");
	}
}
