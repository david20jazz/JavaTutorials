package com.mycom.java.overloading.example1;

// 부모 클래스 OverloadingDemo로 부터 상속
public class OverloadingDemo2 extends OverloadingDemo{
	
	void A (String arg1, String arg2) {
		System.out.println("sub class : void A(String arg1, String arg2)");
	}
	
	void A () {System.out.println("sub class : void A()");}
	
	public static void main(String[] args) {
		// 인스턴스 od 선언
		OverloadingDemo2 od = new OverloadingDemo2();
		
		// 인스턴스 od안에 매개변수가 없는 메소드 A호출
		od.A();
		
		// 인스턴스 od안에 매개변수가 하나 있는 메소드 A호출
		od.A(1);
		
		// 인스턴스 od안에 매개변수가 하나이고 데이터타입이 문자열인 메소드 A호출
		od.A("Hello world!");
		
		// 인스턴스 od안에 매개변수가 두개이고 데이터타입이 문자열인 메소드 A호출
		od.A("Hello world", "everybody!");
	}

}
