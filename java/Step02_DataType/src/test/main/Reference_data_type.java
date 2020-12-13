package test.main;
/*[ java 참조 데이터 type ]

String

-문자열을 다룰 때 사용하는 데이터 type 이다.
-참조 데이터 type 변수에는 참조값(id) 값이 들어 있다.
*/
public class Reference_data_type {
	public static void main(String[] args) {
		//"김구라" 라는 String type 참조값을 name 이라는 지역변수에 대입 
		String name="김구라"; // name=김구라
		System.out.println(name);
		// name 안에 들어 있는 참조값을 myName 이라는 새로운 변수에 대입
		String myName=name;	//myName=김구라
		System.out.println(myName);
		// "원숭이" 라는 String type 참조값을 name 에 덮어 쓰기(새로 대입)
		name="원숭이";
		System.out.println(name);	//name=원숭이
		System.out.println(myName); //myName=김구라
		//String type 참조값이 들어 있는 지역변수 name 을 빈상태로 만들기
		name=null;	//name=김구라
		System.out.println(name);
		System.out.println(myName);
	}	
}

