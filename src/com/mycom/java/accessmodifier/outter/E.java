package com.mycom.java.accessmodifier.outter;
//패키지 inner의 클래스 B를 읽어 온다.
import com.mycom.java.accessmodifier.inner.B;

//클래스 E와 클래스 B는 서로 다른 패키지 소속이고 상속관계도 아니다.
//이런 경우 public을 제외한 나머지 접근제어자는 접근 불가능하다.
public class E {
	//클래스 B의 인스턴스 b선언
	B b = new B();
	
	//접근제어자 public 접근 가능
	void a() {b._public();}
	
	//접근제어자 private 접근 불가능
	//void b() {b._private();}
	
	//접근제어자 protected 접근 불가능
	//void c() {b._protected();}
	
	//접근제어자 default 접근 불가능
	//void d() {b._default();}
}
