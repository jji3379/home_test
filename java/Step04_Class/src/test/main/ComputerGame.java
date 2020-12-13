package test.main;

import mart.Computer;
import mart.Cpu;
import mart.HardDisk;
import mart.Memory;

public class ComputerGame {
	public static void main(String[] args) {
		/*
		 *	[프로그래밍 목적] 
		 * 
		 * 	1. 게임을 한다
		 * 	2. jji3379@naver.com 으로 이메일을 보낸다.
		 */
		Cpu cpu = new Cpu();
		Memory memory = new Memory();
		HardDisk hardDisk = new HardDisk();
		
		Computer game = new Computer(cpu, memory, hardDisk); // 생성자가 정의 되어 있으므로 위의 작업을 해야함
		game.playGame();
		game.sendEmail("jji3379@naver.com");
	}
}
