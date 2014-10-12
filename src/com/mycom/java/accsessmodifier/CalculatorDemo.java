package com.mycom.java.accsessmodifier;
// 클래스 Calculator선언
class Calculator{
	// 접근제어자가 private인 정수형 전역변수 left, right선언
	private int left, right;
	
	// 파라미터값을 받는 메소드 setOprands선언
	public void setOprands(int left, int right){
		// 넘겨받은 파라미터값을 전역변수에 전달
		this.left = left;
		this.right = right;
	}
	
	// 메소드 _sum()선언
	// 접근제어자가 pirvate이면 클래서 내부에서만 호출 가능하다.
	private int _sum(){
		// 덧셈 리턴
		return this.left+this.right;
	}
	
	// 메소드 sumDecoPlus()선언
	public void sumDecoPlus(){
		// 메소드가 호출 되었을때 문자열과 내부 메소드 _sum()출력 
		System.out.println("++++"+_sum()+"++++");
	}
	
	// 메소드 sumDecoMinus()선언
	public void sumDecoMinus(){
		// 메소드가 호출 되었을때 문자열과 내부 메소드 _sum()출력
		System.out.println("----"+_sum()+"----");
	}
}

// 화면에 뿌려질 내용 시작
public class CalculatorDemo {

	public static void main(String[] args) {
		// 클래스 Calculator의 인스턴스 c1선언
		Calculator c1 = new Calculator();
		// 인스턴스 c1의 메소드 setOprands에게 인자값 2개를 파라미터값으로 넘긴다. 
		c1.setOprands(10, 20);
		// 인스턴스 c1의 메소드 sumDecoPlus()호출
		c1.sumDecoPlus();
		// 인스턴스 c1의 메소드 sumDecoMinus()호출
		c1.sumDecoMinus();

	}

}
