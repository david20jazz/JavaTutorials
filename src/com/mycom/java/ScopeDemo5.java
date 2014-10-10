package com.mycom.java;

public class ScopeDemo5 {

	public static void main(String[] args) {
		// for문 안에서만 유효한 변수 i 선언
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// 아래코드의 주석을 지우고 생행하면 에러발생
		// 변수 i가 선언되지 않았기때문
		// System.out.println(i);

	}

}
