package com.mycom.java;
// 클래스 C2선언
class C2 {
	// 전역변수 v선언 후 10으로 초기화
	int v = 10;
	
	// 메소드 m()선언 
	void m() {
		// 지역변수 v선언 후 20으로 초기화
		int v = 20;
		// 지역변수 v값 출력
		// 만약 지역변수 v가 선언되지 안았다면 전역변수 v를 자동으로 사용
		System.out.println(v);
	}
}

public class ScopeDemo8 {

	public static void main(String[] args) {
		// 인스턴스 c1선언
		C2 c1 = new C2();
		// 인스턴스 c1안의 메소드 m()호출
		c1.m();
		// 20출력
	}

}
