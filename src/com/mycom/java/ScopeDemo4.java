package com.mycom.java;

public class ScopeDemo4 {
	// 메소드 a()선언
	// 문자열을 담은 변수 title선언하고 "Hello world!"를 담는다.
	// 메소드 a() 안에서만 유효한 변수 title이 선언 되었다.
	static void a() {
		String title = "Hello world!";
	}
	
	public static void main(String[] args) {
		// 메소드 a()호출
		a();
		// 아래코드의 주석을 지우고 실행하면 에러발생
		// 변수 title이 선언 되지 않았기 때문
		//System.out.println(title);
	}

}
