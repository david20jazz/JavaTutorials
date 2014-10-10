package com.mycom.java.constructor;

class Calculator {
	int left, right;
	
	// 클래스와 같은 이름의 메서드를 만들면 가장 우선 순위로 실행된다.
	// 이것을 Constructor라고 부른다.
	// 생성자를 통해 인자값을 전역변수에 직접 전달할 수 있다.
	public Calculator(int left, int right) {
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

public class CalculatorDemoConstructor {

	public static void main(String[] args) {
		// 생성자는 인스턴스를 생성해주는 역할을 하는 특수한 메소드이며 반환 값이 없다.
		// 생성자의 이름은 클래스의 이름과 동일하다.
		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();
	}

}