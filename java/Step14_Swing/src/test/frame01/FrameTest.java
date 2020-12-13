package test.frame01;

import javax.swing.JFrame;

public class FrameTest {
	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setTitle("제목");
		f.setSize(1000, 500);
		f.setLocation(100, 100); //프레임 켰을 때 시작 위치
		f.setVisible(true);
	}
}
