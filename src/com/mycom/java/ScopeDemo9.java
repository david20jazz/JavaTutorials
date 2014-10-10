package com.mycom.java;
// 클래스 C3선언
class C3 {
	// 전역변수 v선언 후 10으로 초기화
	int v = 10;
	
	// 메소드 m()선언
	void m() {
		// 지역변수 v선언 후 20으로 초기화
		int v = 20;
		// this는 클래스 C3자신을 가리킨다.
		// 따라서 this.v는 전역변수 v이고 10의 값이 출력된다.
		System.out.println(this.v);
	}
}

public class ScopeDemo9 {

	public static void main(String[] args) {
		// 인스턴스 c1선언
		C3 c1 = new C3();
		// 인스턴스 c1안의 메소드 m()호출
		c1.m();
		// 10출력
	}

}
