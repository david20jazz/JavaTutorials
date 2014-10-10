package com.mycom.java;

class Calculator3{
	
	public static void sum(int left, int right) {
		System.out.println(left+right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left+right) / 2);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		// 인스턴스를 만들지 않고 바로 클래스로 접근
		// 출력과 함께 모든값은 초기화
		Calculator3.sum(10, 20);
		Calculator3.avg(10, 20);
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
		
	}

}
