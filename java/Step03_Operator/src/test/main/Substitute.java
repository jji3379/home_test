package test.main;
/*
 *	대입 연산자
 * 	
 * 	-우측에 있는 어떤값을 좌측에 대입하는 연산자
 * 
 * 	=,+=,-=,*=,/=,%=
 */
public class Substitute {
	public static void main(String[] args) {
		//우측에 있는 것을 좌측에 그냥 대입
		int num=10;
		//우측에 있는 값을 원래 값에 더해서 대입
		num+=10; //num=num+10;
		System.out.println(num); 	//20
		
		//우측에 있는 값을 원래 값에 빼서 대입
		num-=10; //num=num-10;
		System.out.println(num);	//10
		
		//우측에 있는 값을 원래 값에 곱해서 대입
		num*=10; //num=num*10;
		System.out.println(num);	//100
		
		//우측에 있는 값을 원래 값에 나눠서 대입
		num/=10; //num=num/10;
		System.out.println(num);	//10

		//우측에 있는 값을 원래 값에 나머지 대입
		num%=10; //num=num%10;
		System.out.println(num);	//0
		
	}
}
