package com.mycom.java.abstractclass.example2;
//추상클래스(abstract)를 사용하기 위해서는 클래스 A를 상속한 하위 클래스를 만들고
//추상 메소드를 오버라이드해서 내용이 존재하는 메소드를 만들어야 한다.

//추상 클래스 A선언
abstract class A{
	
	//추상 메소드 b선언
	public abstract int b();
	
	//메소드 d선언
	public void d(){
		System.out.println("world");
	}
}

//클래스 A로부터 상속받는 클래스 B선언
class B extends A{
	//클래스 A로 부터 상속받은 메소드 b를 오버라이딩해서 내용이 존재하게 한다. 
	public int b(){return 1;}
}

//화면에 뿌려질 내용 시작
public class AbstractDemo {

	public static void main(String[] args) {
		//클래스 B의 인스턴스 obj선언
		//추상 클래스 A로 부터 상속받은 메소드 B를 오버라이딩해서 내용이 존재
		//하도록 했기 때문에 인스턴스화가 가능해진다.
		B obj = new B();
		
		//인스턴스 obj의 메소드 b()호출
		//여기서 메소드 b()는 클래스 B에서 오버라이딩한 메소드 b이다.
		System.out.println(obj.b());
	}

}
