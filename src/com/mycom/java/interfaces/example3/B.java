package com.mycom.java.interfaces.example3;
//인터페이스는 상속이 된다.

//인터페이스 I3선언
interface I3{
	//내용이 비어있는 메소드 x선언
	public void x();
}

//인터페이스 I3로부터 상속받는 인터페이스 I4선언
interface I4 extends I3{
	//메소드 z선언
	public void z();
}

//클래스 B가 인터페이스 I4를 정의한다.
class B implements I4{
	//부모 인터페이스 I3으로부터 상속받은 메소드 x 오버라이딩
	public void x(){}
	//클래스 B가 정의한 인터페이스 I4의 메소드 z 오버라이딩
	public void z(){}
}
