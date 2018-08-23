package co.eventex;

import java.awt.*;
import java.awt.event.*; // �̺�Ʈ�� �ִ� ��� ��� Ȱ���ϰڴٴ� �ǹ�

import com.awtex.WinEvent;

public class ActionEventEx1 extends Frame implements ActionListener {

	
	private TextField tf = new TextField(10);
	
	
	public ActionEventEx1() {
	
		super("ActionEvent");
		
		setLayout(new FlowLayout());
		add(tf); // ���̾ƿ��� �߰�
		
		//�׼��̺�Ʈ�� ���
		tf.addActionListener(this);
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// �׼��� ����� �����Ѵ�.
		
		if(e.getSource() == tf) {
			
			String im = tf.getText();
			System.out.println("Message :" +im);

			//��� �� �ؽ�Ʈ �޽��� â�� �ʱ�ȭ �� ������ ��
			tf.setText("");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	public static void main(String[] args) {
		new ActionEventEx1() ;
	}

}
