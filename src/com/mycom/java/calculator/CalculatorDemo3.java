package com.mycom.java.calculator;

// 클래스 DivisionableCalculator 선언
// extends 로 부모클래스 상속
class DivisionableCalculator extends MultiplicationableCalculator {
	// 메소드 division()선언
	public void division() {
		// left 나누기 right 값 출력
		System.out.println(this.left / this.right);
	}
}

// 화면에 뿌려질 내용 시작
public class CalculatorDemo3 {

	public static void main(String[] args) {
		// 클래스 DivisionableCalculator의 인스턴스 c1 선언
		DivisionableCalculator c1 = new DivisionableCalculator();
		// 클래스 DivisionableCalculator의 부모 클래스 MultiplicationableCalculator의
		// 부모 클래스(증조) Calculator의 메서드 setOprands()사용
		c1.setOprands(10, 20);
		// 증조 클래스 Calculator의 메서드 sum()사용
		c1.sum();
		// 증조 클래스 Calculator의 메서드 avg()사용
		c1.avg();
		// 부모 클래스 MultiplicationableCalculator의 메서드 multiplication()사용
		c1.multiplication();
		// c1 자신의 메서드 division()사용
		c1.division();
		
	}

}
