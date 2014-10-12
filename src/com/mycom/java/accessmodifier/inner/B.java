package com.mycom.java.accessmodifier.inner;

public class B {
	public void _public() {
		System.out.println("public void _public()");
	}
	private void _private() {
		System.out.println("public void _private()");
	}
	protected void _protected() {
		System.out.println("public void _protected()");
	}
	void _default() {
		System.out.println("ublic void x()");
	}
	// 접근제어자가 어떠한 형식이든 클래스 내부에서는 모두 접근 가능
	void a() {_public();}
	void b() {_private();}
	void c() {_protected();}
	void d() {_default();}
}
