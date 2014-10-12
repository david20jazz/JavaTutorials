package com.mycom.java.abstractclass.example3;

//추상클래스 Calculator선언
abstract class Calculator{
	//정수형의 전역변수 left, right선언
	int left, right;
	//파라미터값을 전달하는 메소드 setOprands선언
	public void setOprands(int left, int right){
		//메소드 setOprands의 파라미터값을 전역변수에게 전달
		this.left = left;
		this.right = right;
	}
	//추상메소드 sum()선언
	public abstract void sum();
	//추상메소드 avg()선언
	public abstract void avg();
	//메소드 run()선언
	public void run(){
		//메소드 run()이 호출될때 순차적으로 메소드 sum()과 avg()를 호출한다.
		sum();
		avg();
	}
}
//추상클래스 Calculator로부터 상속받는 클래스 CalculatorDecoPlus선언
class CalculatorDecoPlus extends Calculator{
	//상속받은 추상메소드 sum()을 오버라이딩(내용 재정의)
	public void sum(){
		//파라미터값으로 넘어온 값을 담은 전역변수 left와 right의 더한값을 문자열과 함께 출력
		System.out.println("+ sum :"+(this.left+this.right));
	}
	//상속받은 추상메소드 avg()를 오버라이딩
	public void avg(){
		//파라미터값으로 넘어온 값을 담은 전역변수의 평균값을 문자열과 함께 출력
		System.out.println("+ avg :"+(this.left+this.right)/2);
	}
}
//추상클래스 Calculator로 부터 상속받는 클래스 CalculatorDecoMinus선언
class CalculatorDecoMinus extends Calculator{
	//상속받은 추상메서드 sum()을 오버라이딩
	public void sum(){
		//파라미터값으로 넘어온 값을 담은 전역변수의 덧셈 결과를 문자열과 함께 출력
		System.out.println("- sum :"+(this.left+this.right));
	}
	//상속받은 추상메소드 avg()를 오버라이딩
	public void avg(){
		//파라미터값으로 넘어온 값을 담은 전역변수의 평균값을 문자열과 함께 출력
		System.out.println("- avg :"+(this.left+this.right)/2);
	}
}
//화면에 뿌려질 내용 시작
public class CalculatorDemo {

	public static void main(String[] args) {
		//클래스 CalculatorDecoPlus의 인스턴스 c1선언
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		//파라미터값 2개를 c1의 부모클래스의 메소드 setOprands로 전달
		c1.setOprands(10, 20);
		//c1의 부모클래스의 메소드 run()호출
		c1.run();
		
		//클래스 CalculatorDecoMinus의 인스턴스 c2선언
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		//c2의 부모클래스의 메소드 setOprands에게 2개의 파라미터값 전달
		c2.setOprands(10, 20);
		//c2의 부모클래스의 메소드 run()호출
		c2.run();

	}

}
