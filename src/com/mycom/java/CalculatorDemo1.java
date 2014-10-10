package com.mycom.java;
// Calculator클래스 생성(객체생성)
class Calculator {
	// 전역변수 PI를 3.14의 값으로 생성
	static double PI = 3.14;
	// 전역변수 left, right를 빈값으로 생성
	int left, right;
	
	// setOprands 메소드 생성 지역변수 left, right를 빈값으로 생성
	public void setOprands(int left, int right) {
		// this는 클래스(객체)자신, Calculator를 가리킨다.
		// 즉 this,left 는 전역변수 left를 가리킨다.
		// 우즉의 left는 setOprands메소드의 지역변수 left이다.
		this.left = left;
		this.right =right;
	}
	
	// sum()메소드 생성
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	// avg()메소드 생성
	public void avg() {
		System.out.println((this.left+this.right) / 2);
	}
}
// Calculator클래스(객체)생성 끝
// CalculatorDemo1 클래스 시작
public class CalculatorDemo1 {

	public static void main(String[] args) {
		// Calculator객체 초기화 및 인스턴스 c1 생성
		Calculator c1 = new Calculator();
		// 인스턴스c1를 통해  전역변수 PI에 접근
		System.out.println(c1.PI);
		
		// 인스턴스 c2를 통해 전역변수 PI에 접근
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		// 클래스(객체) Calculator를 통해 PI에 접
		System.out.println(Calculator.PI);
		
		// PI는 클래스(객체)자신과 인스턴스 모두 공용으로 사용할 수 있다.
	}

}

