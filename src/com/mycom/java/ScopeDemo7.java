package com.mycom.java;
// 클래스 C 선언
class C {
	// 전역변수 v 선언 후 10으로 초기화
	int v = 10;
	
	// 메소드 m()선언
	void m() {
		// 전역변수 v의 값 출력
		System.out.println(v);
	}
}

public class ScopeDemo7 {

	public static void main(String[] args) {
		// 인스턴스 c1 선언
		C c1 = new C();
		// 인스턴스 c1안의 메소드 m()호출
		c1.m();
		// 10 출력

	}

}
