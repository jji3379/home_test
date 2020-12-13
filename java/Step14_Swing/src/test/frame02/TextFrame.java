package test.frame02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFrame extends JFrame implements ActionListener{
	JTextField inputText; //생성자에서 정의하면 override에서 참조가 안됨
	//생성자
	public TextFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		//텍스트필드와 버튼 객체를 만들어서
		inputText = new JTextField(10);
		JButton sendBtn = new JButton("전송");
		//패널 객체 생성한 다음
		JPanel topPanel = new JPanel();
		//패널에 텍스트 필드 필드와 버튼을 추가하고
		topPanel.add(inputText);
		topPanel.add(sendBtn);
		//패널의 배경색 지정
		topPanel.setBackground(Color.CYAN);
		
		//패널 째로 프레임의 북쪽에 배치하기
		add(topPanel, BorderLayout.NORTH);
		
		//ActionListener 등록
		sendBtn.addActionListener(this);
	}//생성자 end
	
	//메인 프레임
	public static void main(String[] args) {
		TextFrame TF = new TextFrame("메인 프레임 제목");
		TF.setBounds(100, 100, 500, 200);
		TF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TF.setVisible(true);
	}//메인 프레임 end
	
	//TextFrame에서 생성된 override
	@Override
	public void actionPerformed(ActionEvent e) {
		//1. JTextField 에 입력한 문자열을 읽어와서
			String msg=this.inputText.getText();
		//2. 알림창에 출력한다.
			JOptionPane.showMessageDialog(this, msg);
	}//오버라이드 end
	
}//클래스 end
