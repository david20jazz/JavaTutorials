package com.mycom.java.accessmodifier.inner;
// 클래스 F는 클래스B와 상속관계가 아니다.
// 하지만 같은 패키지에 소속되어 있기 때문에 
// 접근제어자가 private인 경우를 제외하고 모두 접근 가능하다.
public class F {
	B b = new B();
	
	//접근제어자 public 접근 가능
	void a() {b._public();}
	
	//접근제어자 private 접근 불가능
	//void b() {b._private();}
	
	//접근제어자 protected 접근 가능
	void c() {b._protected();}
	
	//접근제어자 default 접근 가능
	void d() {b._default();}
}
