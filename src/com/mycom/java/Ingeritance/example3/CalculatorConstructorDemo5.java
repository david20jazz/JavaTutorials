package com.mycom.java.Ingeritance.example3;
// 이번 예제는 에러 코드를 포함하고 있다.
// 클래스를 선언하게 되면 자바는 자동으로 클래스와 같은 이름의 
// 빈 생성자를 만들게 되는데 이것은 부모 자식의 상속 관계를 만드는
// 핵심이다.
// 아래 코드와 같이 부모 클래스가 매개변수를 갖게 되면 자바는 
// 자동으로 같은 이름의 빈 생성자를 생성하지 않는다. 따라서
// 상속을 할 수 없게 된다.
// 이문제를 해결하기 위해 따로 빈 생성자를 선언해야 한다.

class Calculator {
	int left, right;
	
	// 아래 코드에 주석 처리를 하면 에러가 발생한다.
	// 아래 코드는 자바가 자동으로 생성하지 않는 빈 생성자를 
	// 사용자가 직접 선언하는 것이다. 
	public Calculator(){}
	
	// 여기서 시작하는 코드 때문에 상속에 문제가 생긴다.
	// 클래스와 같은 이름의 생성자가 매개변수를 갖고 있기 때문이다.
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	// 여기까지 상속에 문제를 일으키는 코드이다.
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int left, int right) {
		// super 키워드는 부모 클래스를 의미한다.
		// 아래 코드는 부모 클래스가 가지고 있는 전역변수 left와 right를 가리킨다.
		super(left, right);
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo5 {
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
