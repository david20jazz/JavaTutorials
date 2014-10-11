package com.mycom.java.accsessmodifier;

// 클래스  A선언
class A {
	// public을 접근 제어자라고 한다. public 접근 제어자는 외부에서
	// 불러올 수 있다.
	// 문자열형식의 메소드  y선언
	public String y(){
		
		// 문자열 리턴
		return "public void y()";
	}
	
	// private접근 제어자는 클래스 A안에서 유효하며 외부에서 사용할수 없다.
	// 문자열형식의 메소드 z선언
	private String z(){
		
		// 문자열 리턴
		return "public void z()";
	}
	
	// 문자열형식의 메소드 x선언
	public String x(){
		
		// 클래스 A안에서 유효한 private접근제어자 메소드  z리턴
		return z();
	}
}

// 화면에 뿌려질 내용 시작
public class AccessDemo1 {

	public static void main(String[] args) {
		
		// 클래스 A의 인스턴스 a선언
		A a = new A();
		
		// 인스턴스 a의 메소드 y()호출
		System.out.println(a.y());
		
		// 아래 코드는 오류가 발생한다.
		// System.out.println(a.z());
		
		// 인스턴스 a의 메소드 x()를 통해 private접근제어자의 메소드 z()호출
		// 외부에서 직접 메소드 z()를 호출할 수 없다. 접근제어자가 private이기 때문이다.
		System.out.println(a.x());
	}

}
