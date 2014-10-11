package com.mycom.java.overloading.example1;

public class OverloadingDemo {
	
	// 오버로딩은 한마디로 같은 이름의 메소드를 여러개 사용하고자 할때 사용된다.
	// 데이터형식이 다르고 같은 이름과 매개변수 가지고 있는 메소드는
	// 오버로딩할 수 없다.
	// 데이터형식과 이름이 같고 매개변수의 갯수가 다르면 오버로딩 할 수 있다.
	
	void A (){System.out.println("void A()");}
	void A (int arg1){System.out.println("void A (int arg1)");}
	void A (String arg1){System.out.println("void A (String arg1)");}
	// 아래의 코드는 에러를 발생 시킨다. 자바는 데이터형식이 다른것은 구분하지 않는다.
	// 자바는 메소드의 이름과 매개변수의 숫자가 같으면 중복된다고 판단한다.
	// int A (){System.out.println("void A()");}
	
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		
		// 매개변수가 비어있는 메소드 A호출
		od.A();
				
		// 매개변수가 하나인 메소드 A호출
		od.A(1);
		
		// 매개변수가 문자열인 메소드 A호출
		od.A("Hello world!");

	}

}
