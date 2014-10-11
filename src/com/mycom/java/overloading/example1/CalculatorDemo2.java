package com.mycom.java.overloading.example1;
// 파라미터값을 배열 형식으로 넘기는 예제
// 클래스 Calculator2선언
class Calculator2{
	// 데이터형식이 정수의 배열인 전역변수 oprands선언
	int[] oprands;
	
	// 파라미터 값을 받아오는 메소드 setOprands선언
	// 현재 메소드 안에서만 유효하고 데이터형식이 정수의 배열인 
	// 지역변수 oprands선언
	public void setOprands(int[] oprands) {
		// 메소드의 파라미터값을 전역변수로 넘긴다.
		this.oprands = oprands;
	}
	
	// 메소드 sum()선언
	public void sum() {
		// 데이터형식이 정수인 변수 total의 값을 0으로 초기화
		int total = 0;
		
		// 반복문 foreach 시작
		// 전역변수 oprands에 값을 하나씩 꺼내어 value로 넘긴다.
		for(int value : this.oprands) {
			
			// value의 값을 모두 덧셈 후 total에 담는다.
			total += value;
		}
		
		// 변수 total의 값 출력
		System.out.println(total);
	}
	
	// 메소드 avg선언
	public void avg() {
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		
		// total 나누기 전역변수 oprands에 담긴 배열 수의 결과값 출력
		System.out.println(total/this.oprands.length);
	}
}

public class CalculatorDemo2 {
	
	public static void main(String[] args) {
		// Calculator2의 인스턴스 c1 선언
		Calculator2 c1 = new Calculator2();
		
		// 인스턴스 c1의 메소드 setOprands에게 두개의 인자값을 파라미터값으로 전달
		c1.setOprands(new int[]{10,20});
		
		// 인자값 두개를 가진 메소드 sum()호출
		c1.sum();
		
		// 인자값 두개를 가진 메소드 avg()호출
		c1.avg();
		
		// 인자값 세개를 파라미더값으 전달
		c1.setOprands(new int[]{10,20,30});
		
		// 인자값 세개를 가진 메소드 sum()호출
		c1.sum();
		
		// 인자값 세개를 가진 메소드 avg()호출
		c1.avg();
	}

}
