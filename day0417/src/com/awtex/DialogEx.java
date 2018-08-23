package com.awtex;

import java.awt.*;

public class DialogEx extends Frame {

	private Dialog d = new Dialog(this, " Service for Search", false);
	// ���ο� â�� ���� �� �ִ����� ���θ� ������ ����̶�� �ϴµ�, Ʈ��� �޽��� ���� ǥ���Ѵ�.
	//Ʈ�簪�̸� ����� �ִ� â�� �����ϰ�, �޽����̸� ����� ���� â�� �����ϰ� �ȴ�.
	//����� ����, �߻����̶� ���� ���� Ȯ���ϰ� �����ϱ� ��ƴ�......�̤�
	
	private Label dlb = new Label("Searching Password with Name and PrivateNum");
	private Label dlb1 = new Label("Name", Label.RIGHT);
	private Label dlb2 = new Label("PrivateNum", Label.RIGHT);
	private Label dlb3 = new Label("-", Label.CENTER);

	//�ؽ�Ʈ �Է��� �ʵ尡 �� �� �ʿ�.  �̸�, �ֹι�ȣ-�ֹι�ȣ �̷���.
	private TextField dtf = new TextField(20);
	private TextField dtf1 = new TextField(6);
	private TextField dtf2 = new TextField(7);
	
	//��ư�����
	private Button dbt = new Button("Confirmation");
	private Button dbt1 = new Button("Cancel");
	
	public DialogEx() {
		super("Communication Box");

		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setDialog();
		setSize(300, 200); 
		setVisible(true);
		
		d.setVisible(true);
	}

	private void setDialog() {
		
		d.setLayout(new BorderLayout());
		d.add("North", dlb);
		
		
		//���� �гη� ���´�.
		Panel p1 = new Panel(new BorderLayout());

		
		Panel p2 = new Panel(new GridLayout(2, 1));
		p2.add(dlb1);
		p2.add(dlb2);
		p1.add("West", p2);

		
		
		
		
		Panel p3 = new Panel(new GridLayout(2, 1));
		Panel tPanel = new Panel(new FlowLayout(FlowLayout.LEFT));
		tPanel.add(dtf); //�̸�
		p3.add(tPanel);
		
		
		
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		p4.add(dtf1 ); //6�ڸ�
		p4.add(dlb3 ); // -
		p4.add(dtf2 );//7�ڸ�
		p3.add(p4);

		
		p1.add("Center", p3);
		d.add("Center", p1);
		
		
		
		Panel p = new Panel(new  FlowLayout());
		p.add(dbt);
		p.add(dbt1);
		d.add("South",p);
		//���̾�α� �ڽ����� �������� ȿ���� ����
		WinEvent we = new WinEvent();
		d.addWindowListener(we);
		d.setSize(300, 130);
		d.setResizable(false); //��ȭâ�� ũ�⸦ �ٲ� �� ������ �޽����� ������ 
	
	
	}

	public static void main(String[] args) {
		new DialogEx();
	}

}
