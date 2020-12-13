package test.main;

import war.Marine;
import war.Pentagon;

public class War {
	public static void main(String[] args) {
		/*
		 *	[프로그래밍 목적]
		 *
		 * 	1. 사령부에서 전쟁을 선언하고
		 * 	2. 마린을 움직여서
		 * 	3. 마린으로 공격하고
		 * 	4. 사령부에서 전쟁을 종료
		 */
		Pentagon.startWar(); //static 이여서 class명.메소드
		Marine mar = new Marine(); //public 이니까 개체 생성하고 
		mar.move();	//지역변수명.메소드
		mar.attack();
		Pentagon.endWar();
	}
}
