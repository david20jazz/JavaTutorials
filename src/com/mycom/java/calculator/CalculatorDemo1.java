package com.mycom.java.calculator;

// 클래스 Calculator 선언
class Calculator {
	// 전역변수 left와 right 선언
	int left, right;
	
	// 파라미터 값을 전달하기 위한 메소드 setOprands 선언
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// 메소드 sum()선언
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	// 메소드 avg()선언
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}
// 클래스 SubstractionableCalculator 선언하고 extents "클래스네임"을 통해
// Calculator 부모 클래스로 부터 상속(확장)받는다.
// 부모 클래스로 부터 상속 받게되면 부모 클래스가 가지고 있는 변수,메소드를 그대로
// 사용가능하고 추가적으로 자신이 만든 변수, 메소드도 사용 가능해진다.
class SubstractionableCalculator extends Calculator {
	// 메소드 substract()선언
	public void substract() {
		// 전역변수 left에서 right의 값은 뺀 결과 출력
		System.out.println(this.left - this.right);
	}
}

// 화면에 뿌려질 내용 시작
public class CalculatorDemo1 {
	
	public static void main(String[] args) {
		// 인스턴스 c1선언
		// 여기서 인스턴스 c1은 부모 클래스로 부터 상속받는 자식 클래스가 담겨진다.
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		// 파라미터 값을 전역변수 left와 right에 전달
		// 메소드 setOprands는 인스턴스 c1안에 선언되지 않았지만 부모 클래스에
		// 선언되어 있으므로 사용가능
		c1.setOprands(10, 20);
		// 메소드 sum() 결과 출력 30
		// 메소드 sum() 역시 부모 클래스로 부터 상속 받았다.
		c1.sum();
		// 메소드 avg() 결과 출력 15
		// 메소드avg() 도 부모 클래스로 부터 상속 받았다.
		c1.avg();
		// 메소드 substract() 결과 출력 -10
		// 메소드 substract()는 c1 자신 안에 선언되어 있다.
		c1.substract();
	}
}
