package test.main;

import mypac.MemberDto;

public class MemberDtoEx {
	public static void main(String[] args) {
		//MemberDto 객체 생성해서 참조값을 dto1 이라는 이름의 지역변수에 담기
		MemberDto dto1 = new MemberDto(1, "고양이", "귀여워");
		MemberDto dto2 = new MemberDto(2, "강아지", "덜귀여워");
		
		//dto1.num=1;
		dto1.setNum(999); //setter 메소드를 이용해서 객체에 값 전달하기
		
		//int num=dto1.num;
		int num=dto1.getNum(); //getter 메소드를 이용해서 객체로부터 값 받아오기
		
		//dto1.name="이정호";
		dto1.setName("이정호");
		
		//String name=dto1.name;
		String name=dto1.getName();
		
		//dto1.addr="아현동"
		dto1.setAddr("아현동");
		
		//String addr=dto1.addr;
		String addr=dto1.getAddr();
	}
}
