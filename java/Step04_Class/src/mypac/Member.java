package mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	public void showInfo() {
		System.out.println("----정보----");
		System.out.println("번호:"+this.num);		//새로운 객체를 생성하면 거기서 사용되는 num의 값을 저장
		System.out.println("이름:"+this.name);
		System.out.println("주소:"+this.addr);
		System.out.println("----정보----");
	}
}
