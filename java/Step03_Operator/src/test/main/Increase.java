package test.main;
/*
 * 증감 연산자 테스트
 * 변수에 있는 숫자값을 1씩 증가 혹은 1씩 감소 시킬 때 사용한다.
 * ++,--
 */
public class Increase {
	public static void main(String[] args) {
		int num=0;
		num++;
		num--;
		
		int num3=0;
		int result1=++num3; //result1=1, num3=1
		System.out.println(num3);
		System.out.println(result1);
		int num4=0;
		//변수 뒤에 있는 증감 연산자는 연산의 우선순위가 가장 늦다(대입연산자 보다도 늦다)
		int result2=num4++; //result2=0, num4=1
		System.out.println(num4);
		System.out.println(result2);
		
		int num1=0;
		int num2=0;
		
		int result3=num1-- + ++num2; //result3=1 , num1=-1, num2=1;
		//++num2 가 1로 증가하고 result3로 대입된다. 그 후 num1--이 -1이 된다.
		System.out.println(result3);
		System.out.println(num1);
		System.out.println(num2);
	}
}
