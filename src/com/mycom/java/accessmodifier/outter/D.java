package com.mycom.java.accessmodifier.outter;
// 패키지 com.mycom.java.accessmodifier.inner의 클래스 B를 불러온다.
import com.mycom.java.accessmodifier.inner.B;

// 클래스 D는 다른패키지의 클래스 B로부터 상속받는다.
public class D extends B{
	//접근제어자 public은 접근 가능
	void a() {_public();}
	
	//접근제어자 private은 접근 불가능
	//void b() {_private();}
	
	//접근제어자 protected는 접근 가능
	void c() {_protected();}
	
	//접근제어자 default는 접근 불가능
	//void d() {_default();}
}
