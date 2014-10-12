package com.mycom.java.polymorphism;
//인터페이스와 다형성

//인터페이스 I2선언
interface I2{
	//데이터 형식이 문자열이고 비어있는 메소드 A선언
	public String A();
}
//인터페이스 I3선언
interface I3{
	//데이터 형식이 문자열이고 비어있는 메소드 B선언
	public String B();
}
//인터페이스 I2와 I3를 구현하는 클래스 D선언
class D implements I2, I3{
	//인터페이스 I2의 메소드 A()를 오버라이딩
	public String A(){
		//문자 A를 리턴
		return "A";
	}
	//인터페이스 I3의 메소드 B()를 오버라이딩
	public String B(){
		//문자 B를 리턴
		return "B";
	}
}
//화면에 뿌려질 내용 시작
public class PolymorphismDemo3 {

	public static void main(String[] args) {
		//클래스 D의 인스턴스 obj선언, 데이터 형식이 클래스 D와 같다. 
		D obj = new D();
		//클래스 D의 인스턴스 objI2선언, 데이터 형식이 인터페이스 I2와 같다.
		I2 objI2 = new D();
		//클래스 D의 인스턴스 objI3선언, 데이터 형식이 인터페이스 I3와 같다.
		I3 objI3 = new D();
		
		//인스턴스 obj는 클래스 D에 오버라이딩된 I2와 I3의 모든 메서드에 접근 가능하다.
		obj.A();
		obj.B();
		
		//인스턴스 objI2는 클래스 D에 오버라이딩된 I2의 메서드에만 접근 가능
		objI2.A();
		//I3의 메서드에는 접근 불가능
		//objI2.B();
		
		//I2의 메서드에는 접근 불가능
		//objI3.A();
		//인스턴스 objI3는 클래스 D에 오버라이딩된 I3의 메서드에만 접근 가능
		objI3.B();

	}

}
