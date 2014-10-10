package com.mycom.java;

public class ScopeDemo3 {
	// 전역변수 i 선언
	static int i;
	
	// 메소드 a()선언 후 
	// 메소드 a()안에서만 유효한 변수 i 선언 후 0으로 초기화
	static void a() {
		int i = 0;
	}
	
	// 화면에 뿌려질 코드 시작
	public static void main(String[] args) {
		// 반복문 for 시작
		// 전역변수 i 사용
		for (i = 0; i < 5; i++) {
			// 메소드 a() 안의 지역변수 i는 외부코드에 영향을 주지 않는다.
			a();
			// 정상적인 값 출력
			System.out.println(i);
		}
	}
}
