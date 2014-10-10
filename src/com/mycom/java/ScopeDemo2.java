package com.mycom.java;

public class ScopeDemo2 {
	// 전역변수 i 선언
	static int i;
	// 메소드 a() 선언하고 전역변수 i에 0을 담는다.
	static void a() {
		i = 0;
	}
	
	public static void main(String[] args) {
		// 반복문 for 시작
		// 변수 i는 전역변수 i만 선언 되어 있으므로 for문에서 따로 선언하지 않고 그대로
		// 변수 i를 사용할 경우 이미 선언되어 있는 전역변수 i를 사용하게 된다.
		// 메소드 a()를 호출하면 전역변수 i 는 0의 값으로 초기화된다. 
		// 따라서 for문에서 1증가 하더라도 증가된 값이 메소드 a()를 만나면서 다시 0으로
		// 초기화 되면서 무한 0을 화면에 뿌린다.
		for (i = 0; i < 5; i++) {
			// 메소드 a()가 전역변수 i를 0으로 초기화 하기때문에 시스템 전체에 영향을 준다.
			a();
			System.out.println(i);
		}
	}
}
