package test.frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameExtends extends JFrame{
	//생성자 JFrame이 아니고 내가 만든 프레임
	public FrameExtends(String title) {//class명과 같아야함
		super(title); //부모생성자에 전달하기
		//레이아웃 매니저 지정하기
		setLayout(new FlowLayout()); //물 흐르듯이 배치되는 레이아웃
		//버튼
		JButton sendBtn=new JButton("전송");
		JButton updateBtn=new JButton("수정");
		JButton deleteBtn=new JButton("삭제");
		//버튼을 프레임에 배치하기
		add(sendBtn);
		add(updateBtn);
		add(deleteBtn);
		//버튼에 리스너 등록하기
		sendBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(this, "전송합니다");
		});
		updateBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(this, "수정합니다");
		});
		deleteBtn.addActionListener((e)->{
			JOptionPane.showMessageDialog(this, "삭제합니다");
		});
	}
	public static void main(String[] args) {
		FrameExtends fe = new FrameExtends("제목 입력");
		fe.setBounds(100,100,500,300);  //위치와 크기 지정
		//프레임을 닫으면 프로세스가 종료 되도록 (앱이 종료 되도록)
		fe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		fe.setVisible(true); //화면상에 실제 보이게 된다.
	}
}
