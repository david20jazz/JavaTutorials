package com.mycom.java.overloading.example1;

// 클래스 Calculator선언
class Calculator{
	int left, right;
	int third = 0;
	
	// 매개변수가 두개인 메소드 setOprands 선언
	public void setOprands(int left, int right){
		
		// 호출될때 화면에 뿌려질 문자열
		System.out.println("setOprands(int left, int right)");
		
		// 파라미터 값을 전역변수로 넘긴다.
		this.left = left;
		this.right = right;
	}
	
	// 매개변수가 세개인 setOprands 선언
	public void setOprands(int left, int right, int third){
		
		// 호출될때 화면에 뿌려질 문자열
		System.out.println("setOprands(int left, int right, int third)");
		
		// 파라미터 값을 전역변수로 넘긴다.
		this.left = left;
		this.right = right;
		this.third = third;
		// 중복을 없애기 위해 15,16라인의 코드를 지우고 14라인에 아래 코드를 넣어도 된다.
		// this.setOprands(left, right);
	}
	
	// 덧셈 메소드 sum()선언 
	public void sum(){
		System.out.println(this.left + this.right + this.third);
	}
	
	// 평균값 메소드 avg()선언
	public void avg(){
		System.out.println((this.left + this.right + this.third) / 3);
	}
}

// 화면에 뿌려질 내용 시작
public class CalculatorDemo {

	public static void main(String[] args) {
		
		// 클래스 Calculator의 인스턴스 c1 선언
		Calculator c1 = new Calculator();
		
		// 인스턴스 c1의 메소드 setOprands에게 인자 두개를 파라미터값으로 넘긴다.
		// 매개변수가 두개와 세개인 같은 이름의 메소드가 있으면 넘겨주는 파라미터의 인자
		// 갯수에 따라 자동으로 자바가 찾아서 연결해 준다.
		c1.setOprands(10, 20);
		
		// 인자값 두개를 넘겨받은 메소드 sum()호출
		c1.sum();
		
		// 인자값 두개를 넘겨받은 메소드 avg()호출
		c1.avg();
		
		// 인자값 세개를 파라미터값으로 넘겨준다.
		c1.setOprands(10, 20, 30);
		
		// 인자값 세개를 넘겨받은 메소드 sum()호출
		c1.sum();
		
		// 인자값 세개를 넘겨받은 메소드 avg()호출
		c1.avg();

	}

}
