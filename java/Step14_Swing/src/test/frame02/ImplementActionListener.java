package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ImplementActionListener extends JFrame implements ActionListener{
	//생성자 JFrame이 아니고 내가 만든 프레임
	public ImplementActionListener(String title) {//class명과 같아야함
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
		sendBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		//버튼에 ActionCommand 를 원하는대로 지정할 수 있다.
		sendBtn.setActionCommand("send");
		updateBtn.setActionCommand("update");
		deleteBtn.setActionCommand("delete");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//이벤트가 일어난 UI (Button) 의 ActionCommand 값을 읽어온다.
		String command=e.getActionCommand();
		//문자열(String)의 내용을 비교할 때는 ==를 사용하지 말고
		//.equals() 메소드를 이용해야 한다.
		if (command.equals("send")) {
			JOptionPane.showMessageDialog(this, "전송합니다.");
		}else if(command.equals("update")) {
			JOptionPane.showMessageDialog(this, "수정합니다.");
		}else if(command.equals("delete")) {
			JOptionPane.showMessageDialog(this, "삭제합니다.");
		}
	}
	
	//메인 프레임
	public static void main(String[] args) {
		ImplementActionListener ial = new ImplementActionListener("메인 프레임");
		ial.setBounds(100, 100, 500, 300);
		ial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ial.setVisible(true);
	}
}
