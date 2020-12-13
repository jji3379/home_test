package test.main;

public class Casting {
	public static void main(Reference_data_type[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		/*
		 *	정수의 표현 가능한 범위 순서			 
		 * 	byte < short < int < long
		 */
		int myInt=100;
		byte myByte=100;
		//int type 변수에 있는 값을 int type 변수에 대입
		int a=myInt;
		int b=myByte;
		//<오류>	int type 변수에 있는 값을 byte type 변수에 대입
		//byte c=myInt;
		
		/*
		 * 표현 가능한 범위가 더 넓은 변수에 담기 내용을 대입하려면
		 * 프로그래머가 대입을 해도 문제가 없다는 것을 확인하고
		 * 명시적으로  casting 하면 대입이 가능하다
		 * ( myInt 안에 있는 숫자는 byte 범위를 절대 넘어가지 않아 !) 
		 */
		byte c=(byte)myInt; //강제 casting 을 하면 대입 가능
		System.out.println(c);
		//100 이 저장되어 있는 변수에 200을 대입하고
		myInt=200;
		//강제 casting 해서 대입 한다면? (byte 범위는 -128~127)
		byte d=(byte)myInt; 
		System.out.println(d); //원래 값과 다른 값이 대입된다(-56)
		
	}
}
