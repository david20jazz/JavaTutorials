package com.mycom.java.accessmodifier.inner;
// 클래스 C는  클래스 B로부터 상속 받는다.
public class C extends B{
	void a() {_public();}
	// 부모 클래스인 B에 접근제어자가 private이 있을 경우 접근 불가
	// 따라서 아래 주석처리된 코드는 에러를 발생한다.
	//void b() {_private();}
	void c() {_protected();}
	void d() {_default();}
}
