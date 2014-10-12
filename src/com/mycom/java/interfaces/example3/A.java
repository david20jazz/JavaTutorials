package com.mycom.java.interfaces.example3;
//interface는 여러명의 개발자가 하나의 프로젝트를 효율적으로 개발하기 위한 약속의 정의이다.

//인터페이스 I1선언
interface I1{
	//메소드 x()선언
	//추상메소드처럼 내용을 정의하지 않아야 한다.
	//반드시 접근제어자는 public이어야 한다. 
	public void x();
}

//인터페이스 I2선언
interface I2{
	//메소드 z()선언
	public void z();
}

//클래스 A는 인터페이스 I1, I2를 정의하고 있다.
class A implements I1, I2{
	//상속받은 인터페이스의 메소드들은 오버라이딩해야 사용할 수 있다.
	//접속제어자는 반드시 public이어야 한다.
	public void x(){}
	public void z(){}
}
