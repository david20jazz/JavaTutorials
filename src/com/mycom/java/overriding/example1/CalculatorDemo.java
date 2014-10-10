package com.mycom.java.overriding.example1;

// 클래스 Calculator 선언
class Calculator {
	// 데이터 형식이 정수인 전역변수 left와 right선언
	int left, right;
	
	// 파라미터 값을 전역변수로 넘기는 메소드 setOprands 선언
	public void setOprands(int left, int right) {
		// left와 right가 받아온 값을 전역변수 left와 right에 담는다.
		this.left = left;
		this.right = right;
	}
	
	// 전역변수 left와 right의 더한값을 출력하는 메소드 sum()선언
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	// 평균값을 구하는 메소드 avg()선언
	public int avg() {
		return ((this.left + this.right) / 2);
	}
}

// 자식 클래스 SubstractionableCalculator선언
class SubstractionableCalculator extends Calculator {
	
	// 부모 클래스로 부터 상속받은 sum()을 오버라이딩(overriding)하여
	// 출력값에 문자열을 추가 하고 있다. 여기서 메소드 sum()은
	// 부모클래스가 아닌 자신의 sum()이 우선순위를 갖고 실행된다.
	public void sum() {
		System.out.println("실행 결과는 " +(this.left + this.right)+ "입니다.");
	}
	
	public int avg() {
		// 부모 클래스의 메소드를 중복없이 사용하기 위해서
		// super(부모클래스)에 들어있는 avg()메소드를 호출하여
		// return하고 있다.
		return super.avg();
	}
	
	// 자식 클래스 자신의 메소드 substract()선언
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		// SubstractionableCalculator의 인스턴스 c1선언
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		
		// 메소드 setOprands에 파라미터값 전달
		c1.setOprands(10, 20);
		
		// 인스턴스 c1의 메소드 sum()호출
		c1.sum();
		
		// 문자열과 함께 인스턴스 c1의 부모클래스의 메소드 avg()호출
		System.out.println("실행 결과는 " + c1.avg());
		
		// 인스턴스 c1 자신의 메소드 substract()호출
		c1.substract();
	}

}
