package com.mycom.java.exception;

class Calculator{
	int left, right;
	public void setOprands(int lef, int right){
		this.left = left;
		this.right = right;
	}
	public void divide(){
		System.out.print("계산결과는 ");
		System.out.print(this.left/this.right);
		System.out.print(" 입니다.");
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();
		
		/*출력결과
	계산결과는 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.mycom.java.exception.Calculator.divide(CalculatorDemo.java:11)
	at com.mycom.java.exception.CalculatorDemo.main(CalculatorDemo.java:21)
		 */

	}

}
