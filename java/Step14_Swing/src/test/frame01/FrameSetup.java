package test.frame01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameSetup {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setTitle("고양이"); //제목
		f.setSize(500, 300);//사이즈
		f.setLocation(100, 100); //위치
		//창닫기 (X) 를 누르면 자동으로 프로세스가 종료 되도록 설정
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null); //배치매니저를 사용하지 않겠다(절대좌표에 절대 크기로 배치하겠다)
		JButton btn=new JButton("고양이 귀엽다"); //버튼 객체 생성
		btn.setBounds(10,10,150,40); //버튼의 위치와 크기 지정
		f.add(btn); //프레임에 버튼 추가하기
		f.setVisible(true); //프레임을 보이게 한다. <<이거 안하면 프레임이 안보임>>
		
		JButton btn2=new JButton("강아지는 그냥그럼");
		btn2.setBounds(170,10,150,40);
		f.add(btn2);
		
		//ActionListener 인터페이스 type 의 참조값 얻어내기
		ActionListener listener=new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("인정합니다");
				//JOptionPane 클래스의 static 메소드를 이용해서 알림창 띄우기 : .찍어서 참조
				//.showMessageDialog(프레임의 참조값, 띄울 문자열)
				JOptionPane.showMessageDialog(f, "킹정입니다");
			}
		};
		btn.addActionListener(listener);
		/*
		ActionListener listener2 = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("강아지는 쫌...");
				//JOptionPane 클래스의 static 메소드를 이용해서 알림창 띄우기 : .찍어서 참조
				//.showMessageDialog(프레임의 참조값, 띄울 문자열)
				JOptionPane.showMessageDialog(f, "고양이 압승");
			}
		};
		btn2.addActionListener(listener2);
		*/
		 	//람다식을 활용하면 아래와 같다 
		  	btn2.addActionListener((e)->{
		  		JOptionPane.showMessageDialog(f, "고양이 압승");
		   });
	
	}
}
