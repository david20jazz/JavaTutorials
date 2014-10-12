package com.mycom.java.polymorphism;
//추상클래스 Calculator선언
abstract class Calculator{
	//정수형 전역변수 left, right선언
	int left, right;
	//파라미터값을 받는 메소드 setOprands선언
	//메소드 setOprands안에서만 유효한 정수형 매개변수 left, right선언
	public void setOprands(int left, int right){
		//파라미터 값을 전역변수 left, right로 넘긴다.
		this.left = left;
		this.right = right;
	}
	//정수형 메소드 _sum선언
	int _sum(){
		//전역변수 left와 right 덧셈 결과 리턴
		return this.left + this.right;
	}
	//추상클래스 sum선언
	public abstract void sum();
	//추상클래스 avg선언
	public abstract void avg();
	//메소드 run선언
	public void run(){
		//메소드 sum()과 avg()를 순차적으로 호출
		sum();
		avg();
	}
}

//클래스 Calculator로부터 상속받는 클래스 Calculator선언
class CalculatorDecoPlus extends Calculator{
	//부모클래스로 부터 상속받은 메소드 sum()을 오버라이딩
	public void sum(){
		//문자열과 메소드 _sum()의 결과값 출력
		System.out.println("+ sum :"+ _sum());
	}
	//부모클래스로 부터 물려받은 메소드 avg()를 오버라이딩
	public void avg(){
		//문자열과 함께 전역변수 left와 right를 더한 값의 평균값 출력
		System.out.println("+ avg :"+ (this.left+this.right)/2);
	}
}

//클래스 Calculator로 부터 상속받는 클래스 CalculatorDecoMinus선언
class CalculatorDecoMinus extends Calculator{
	//부모클래스로 부터 상속받은 메소드 sum()을 오버라이딩
	public void sum(){
		//문자열과 부모클래스의 메소드 _sum의 결과값 출력
		System.out.println("- sum :"+ _sum());
	}
	//부모클래스로 부터 상속받은 메소드 avg()를 오버라이딩
	public void avg(){
		//문자열과 전역변수 left+right의 평균값 출력
		System.out.println("- avg :"+(this.left+this.right)/2);
	}
}
//화면에 뿌려질 내용 시작
public class CalculatorDemo {
	//메소드 execute선언
	//부모클래스 Calculator를 데이터 형식으로 하는 변수 cal선언 
	public static void execute(Calculator cal){
		//문자열 출력
		System.out.println("실행결과");
		//변수 cal의 부모클래스 안에 존재하는 메소드 run()호출
		cal.run();
	}

	public static void main(String[] args) {
		//클래스 CalculatorDecoPlus의 인스턴스 c1선언
		//데이터형식이 부모클래스 Calculator이다.
		Calculator c1 = new CalculatorDecoPlus();
		//부모클래스의 메소드 setOprands에게 파라미터값 전달
		c1.setOprands(10, 20);
		
		//클래스 CalculatorDecoMinus의 인스턴스 c2선언
		//데이터타입이 부모클래스 Calculator이다.
		Calculator c2 = new CalculatorDecoMinus();
		//부모클래스의 메소드 setOprands에게 파라미터값 전달
		c2.setOprands(10, 20);
		
		//메소드 extcute를 통해 인스턴스 c1호출
		execute(c1);
		//메소드 extcute를 통해 인스턴스 c2호출
		execute(c2);
	}

}
