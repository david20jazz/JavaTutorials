package com.mycom.java.exception;

class A{
	private int[] arr = new int[3];
	A(){
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	public void z(int first, int second){
		//오류검사 try,catch사용하기
		try{
			//오류가 의심되는 코드
			System.out.println(arr[first] / arr[second]);
			//오류를 찾아서 출력하는 코드
		} catch(ArrayIndexOutOfBoundsException e){
			//배열밖 영역에 대한 오류에 해당한다면 아래 메세지 출력
			System.out.println("ArrayIndexOutOfBoundsExcenption");
		} catch(ArithmeticException e){
			//산술오류에 대한 오류에 해당한다면 아래 메세지 출력
			System.out.println("ArithmeticException");
			//Exception은 항상 마지막에 선언해야 한다.
			//예외(오류) 출력
		} catch(Exception e){
			System.out.println("Exception");
			//finally는 유효성 검사가 끝나도 오류가 DB와 연결되는 현상을
			//종료 시키기 위해 사용한다.
		} finally{
			System.out.println("finally");
		}
	}
}
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// 클래스 A의 인스턴스 a선언
		A a = new A();
		//메소드 z에게 파라미터값 10과 0전달 후 연산결과 출력
		//첫번째 인자값이 첫번째 배열에 할당된 0보다 크기 때문에 오류발생 
		a.z(10, 0);
		//1을 0으로 나눌 수 없기 때문에 오류발생
		a.z(1, 0);
		//2를 1로 나누면 2
		a.z(2, 1);
	}

}
