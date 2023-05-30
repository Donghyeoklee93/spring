package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception {
//		Hello hello = new Hello();
//		hello.main();
//		hello.main2(); // private이어서 error
//		hello.main3();
		
		
		//Reflection API를 사용 - 클래스 정보를 얻고 다룰 수 있는 강력한 기능제공
		//java.lang.reflect패키지를 제공
		//Hello클래스의 Class객체(클래스의 정보를 담고 있는 객체)를 얻어온다.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		
		Hello hello = (Hello) helloClass.newInstance(); // Class객체가 가진 정보로 객체 생성
		Method main2 = helloClass.getDeclaredMethod("main2");
		main2.setAccessible(true); // private인 main2()를 호출가능하게 한다.
		
		main2.invoke(hello); //hello.main2()
		
		
	}

}
