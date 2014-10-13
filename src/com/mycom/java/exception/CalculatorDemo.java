package com.mycom.java.exception;

class Calculator{
	int left, right;
	public void setOprands(int lef, int right){
		this.left = left;
		this.right = right;
	}
	public void divide(){
		/*출력결과
		계산결과는 

		e.getMessage()
		/ by zero
		
		
		e.toString()
		java.lang.ArithmeticException: / by zero
		
		
		e.printStackTrace()
		java.lang.ArithmeticException: / by zero
			at com.mycom.java.exception.Calculator.divide(CalculatorDemo.java:15)
			at com.mycom.java.exception.CalculatorDemo.main(CalculatorDemo.java:32)
		
		divide End
		*/
		try {
			System.out.print("계산결과는 ");
			System.out.print(this.left/this.right);
			System.out.print(" 입니다.");
		} catch(Exception e){
			System.out.println("\n\ne.getMessage()\n"+ e.getMessage());
			System.out.println("\n\ne.toString()\n"+ e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
		System.out.println("divide End");
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		c1.divide();	

	}

}
