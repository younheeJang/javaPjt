package co.eventex;

import java.awt.*;
import java.awt.event.*; // 이벤트에 있는 모든 요소 활용하겠다는 의미

import com.awtex.WinEvent;

public class ActionEventEx1 extends Frame implements ActionListener {

	
	private TextField tf = new TextField(10);
	
	
	public ActionEventEx1() {
	
		super("ActionEvent");
		
		setLayout(new FlowLayout());
		add(tf); // 레이아웃에 추가
		
		//액션이벤트에 등록
		tf.addActionListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 액션의 기능을 구현한다.
		
		if(e.getSource() == tf) {
			
			String im = tf.getText();
			System.out.println("Message :" +im);

			//출력 후 텍스트 메시지 창을 초기화 즉 비워줘야 함
			tf.setText("");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	public static void main(String[] args) {
		new ActionEventEx1() ;
	}

}
