package test.main;
/*
 *	3항 연산자 
 * 	
 * 	1 ? 2 : 3;
 */
public class Triple {
	public static void main(String[] args) {
		boolean isWait=false;
		
		String result=isWait? "기다려요" : "기다리지 않아요"; //true : 기다려요, false : 기다리지 않아요
		System.out.println(result);
		
		//3항 연산자랑 같은 내용
		String result2=null;
		if (isWait) {
			result2="기다려요";
		} else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
		double reuslt3=isWait ? 10.12 : 99.5;
	}
}
