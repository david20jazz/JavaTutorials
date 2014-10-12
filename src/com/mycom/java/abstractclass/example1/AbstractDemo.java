package com.mycom.java.abstractclass.example1;

abstract class A{
	public abstract int b();
	//본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//public abstract int c(){System.out.println("Hello);}
	//추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	public void d(){
		System.out.println("world");
	}
}

public class AbstractDemo {
	public static void main(String[] args){
		//주석 처리된 아래의 코드는 인스턴스화 할수없다는 에러를 발생 시킨다.
		//추상 클래스는 구체적인 메소드의 내용이 존재하지 않기 때문이다.
		//A obj = new A();
	}
}
