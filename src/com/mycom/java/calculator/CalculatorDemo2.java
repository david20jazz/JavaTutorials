package com.mycom.java.calculator;

// 클래스 MultiplicationableCalculator 선언
// extends "부모클래스네임"을 통해 부모 클래스 Calculator로 부터 상속
class MultiplicationableCalculator extends Calculator {
	// 곱하기 메서드 선언
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

// 화면에 뿌려질 내용 시작
public class CalculatorDemo2 {

	public static void main(String[] args) {
		
		// 클래스 MultiplicationableCalculator를 사용한 인트턴스 c1선언 
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		// 파라미터 값을 전역변수에 전달
		// 메소드 setOprands()는 클래스 MultiplicationableCalculator의 부모 클래스
		// Calculator로 부터 상속받았다.
		c1.setOprands(10, 20);
		// 메소드 sum()역시 부모 클래스로 부터 상속받음
		c1.sum();
		// 메소드 avg()도 부모 클래스로 부터 상속 받음
		c1.avg();
		// 메소드 multiplication()은 c1자신 안에 선언되어 있는 메소드이다.
		c1.multiplication();

	}

}
