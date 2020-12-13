package test.main;

public class Comparison {
	public static void main(String[] args) {
		//or 연산
		boolean result1=false||false;	//false
		boolean result2=true||false;	//true
		boolean result3=false||true;	//true
		boolean result4=true||true;		//true
		//and 연산
		boolean result5=false&&false;	//false
		boolean result6=true&&false;	//false
		boolean result7=false&&true;	//false
		boolean result8=true&&true;		//true
		//not 연산
		boolean result9=!false;			//true
		boolean result10=!true;			//false
	}
}
