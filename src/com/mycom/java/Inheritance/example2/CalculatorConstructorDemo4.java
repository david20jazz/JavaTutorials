package com.mycom.java.Inheritance.example2;

// 클래스 Calculator 선언
// 전역변수 left와 right 선언
class Calculator {
	int left, right;
	
	// 메소드 setOprands선언 
	// 매개변수(지역변수) left와 right선언
	// 매개변수(지역변수) left와 right로 들어온 파라미터 값을 
	// 전역변수 this.left와 this.right로 넘긴다.
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// 메소드 sum()선언
	// 전역변수 this.left와 this.right 값의 합을 출력
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	// 메소드 avg()선언
	// 전역변수 this.left와 this.right를 합한 후 2로 나눈값 출력(평균)
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

// 클래스 SubstractionableCalculator선언 하고 extends "부모클래스"로
// 상속관계 설정, 클래스 Calculator를 부모로 하고 부모의 모든 변수와 메소드를
// 물려받는다.
class SubstractionableCalculator extends Calculator {
	
	// 클래스 자신이 추가로 매개변수(지역변수)left와 right 선언
	// 매개변수의 파라미터값을 전역변수에 전달
	public SubstractionableCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// 메소드 substract()선언
	// 전역변수 left에서 right를 뺀 값 출력
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

// 화면에 뿌려질 내용 시작
public class CalculatorConstructorDemo4 {
	public static void main(String[] args) {
		// 클래스 SubstractionableCalculator의 인스턴스 c1선언
		// 파라미터 값으로 10과 20 입력 
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		// 인스턴스 c1의 부모 클래스로 부터 물려받은 메소스 sum()호출
		c1.sum();
		// 인스턴스 c1의 부모 클래스로 부터 물려받은 메소드 avg()호출
		c1.avg();
		// 인스턴스 c1 자신이 가지고 있는 메소드 substract() 호출
		c1.substract();
	}
}
