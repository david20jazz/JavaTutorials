package com.mycom.java.polymorphism;
//클래스와 다양성
//클래스 A선언
class A{
	//문자열형식의 메소드 x()선언
	//문자열 "A.x"리턴
	public String x(){return "A.x";}
}
//클래스 A로부터 상속받는 클래스 B선언
class B extends A{
	//부모클래스 A로부터 상속받은 메소드 x를 오버라이딩하여 문자열 "B.x"가 출력되도록 수정
	public String x(){return "B.x";}
	//클래스 B자신의 메소드 y선언
	public String y(){return "y";}
}
//클래스 A로부터 상속받는 클래스 B2선언
class B2 extends A{
	//부모 클래스로부터 상속받은 메소드 x를 오버라이딩
	public String x(){return "B2.x";}
}
//화면에 뿌려질 내용 시작
public class PolymorphismDemo1 {

	public static void main(String[] args) {
		//클래스 B의 인스턴스 obj를 선언했지만 데이터타입은 부모클래스 A형식을 가지고 있다.
		//즉 인스턴스 obj는 부모 클래스 A의 메소드만 사용 가능하다.
		A obj = new B();
		A obj2 = new B2();
		//인스턴스 obj의 부모클래스 A로 부터 상속받은 메소드 x를 호출하고 있다.
		//여기서 출력결과는 부모클래스 A의 메소드 x의 리턴값이 아니다.
		//자기 자신인 클래스 B에 오버라이딩한 메소드 x의 리턴값이 출력된다.
		System.out.println(obj.x());
		//인스턴스 obj2의 부모클래스로부터 상속받은 메소드 x를 오버라이딩한 메소드 x호출
		System.out.println(obj2.x());
	}

}
