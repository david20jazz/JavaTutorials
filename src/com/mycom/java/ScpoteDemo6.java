package com.mycom.java;

public class ScpoteDemo6 {
	static int i = 5;
	
	// 메소드 a()선언
	// 메소드 a()안에서만 유효한 변수 i 선언 후 10으로 초기화
	static void a() {
		int i = 10;
		// 메소드 b()호출
		b();
	}
	
	// 메소드 b()선언
	// 전역변수 i의 값을 출력한다.
	static void b() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		a();

	}

}
