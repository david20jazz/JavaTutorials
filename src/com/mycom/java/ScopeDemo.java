package com.mycom.java;
// 클래스 시작
public class ScopeDemo {
		// 메서드 a() 선언
		// 데이터 형식이 int인 변수 i 선언 후 0을 담는다.
		static void a() {
			int i = 0;
		}
		
		// 메소드 main안에 문자열을 담는 배열 args 선언 
		public static void main(String[] args) {
			// 반복문 for 선언
			// for문 안에서만 유효한 int i선언 후 0을 담는다.
			// 변수 i는 5보다 작은 동안 반복한다.
			// 변수 i는 for문이 한번 돌때마다 1씩 증가한다.
			for (int i = 0; i < 5; i++) {
				// 메소드 a()호출
				a();
				// 변수 i 결과값 출력
				System.out.println(i);
			}
		}
}
