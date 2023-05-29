package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;

	@RequestMapping("/hello")
	public void main() {
		System.out.println("Hello");
		System.out.println(cv); //OK 
		System.out.println(iv); //OK
	}
	
	@RequestMapping("/hello_private")
	private void main2() {
		System.out.println("Hello - private");
		System.out.println(cv); //OK 
		System.out.println(iv); //OK
	}
	
	@RequestMapping("/hello_static")
	public static void main3() {
		System.out.println("Hello - static");
		System.out.println(cv); //OK
//		System.out.println(iv); //error
	}
	
}
