package com.employee;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

//�гη� ��� ���� �Է��� ���� Ŭ���� ����
public class AddPane extends JPanel implements ActionListener, ItemListener {

	// Swing �������
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField jt[] = new JTextField[5];
	private JButton okayButton;
	private JButton resetButton;
	private int department = 10;

	// �Է� ���� �׸� ����
	String[] caption = { "name", "jobGrade", "email", "department" };

	// �ֵ� �г�
	public AddPane() {
		setLayout(new GridLayout(6, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;
		// �Է¹��� ����

		// �ؽ�Ʈ �ʵ�� ���̺��� �гο� ��� AddPane�� ����
		int i;
		for (i = 0; i < size - 1; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			jt[i] = new JTextField(15);
			jp[i].add(jl[i]);
			jp[i].add(jt[i]);
			add(jp[i]);
		}
		//������ �� ���� 
		jp[i] = new JPanel();
		jl[i] = new JLabel(caption[i]);
		jp[i].add(jl[i]);
		add(jp[i]);

		JComboBox combo = new JComboBox();
		combo.addItem("�μ���ȣ�� �����ϼ���");

		for (int c = 1; c <= 5; c++) {
			combo.addItem(c * 10); // �μ���ȣ 10~50������ 10 20 30 40 50 �μ���ȣ �߰���
		}

		jp[i].add(combo);
		combo.addItemListener(this);

		jp[size] = new JPanel();
		okayButton = new JButton("�����ϱ�");
		okayButton.addActionListener(this);
		resetButton = new JButton("�ٽ� �ۼ�");
		resetButton.addActionListener(this);

		jp[size].add(okayButton);
		jp[size].add(resetButton);
		add(jp[size]);

	}

	// �޺� �ڽ��� ���� �̺�Ʈ ó��
	@Override
	public void itemStateChanged(ItemEvent ie) {

		if (ie.getStateChange() == ie.SELECTED) {
			department = Integer.parseInt(ie.getItem().toString());
		}

	}

	
	// ��ư�� ���� �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent ae) {
		String ae_type = ae.getActionCommand();
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;
		
		if(ae_type.equals(okayButton.getText())) {
			//�����ϱ� ��ư�� Ŭ���Ǿ��� ���
			try {
				evo = new EmployeeVO(0, jt[0].getText(), jt[1].getText(),  department,  jt[2].getText());
				edvo = new EmployeeDAO();
				edvo.getEmployeeregiste(evo);
			} catch (Exception e) {
				e.printStackTrace();
			}if(edvo != null)
		
		
		JOptionPane.showMessageDialog(this,  jt[0].getText()+"���� ���������� �߰�");
		}else if(ae_type.equals(resetButton.getText())){
			int size = caption.length;
		
			for(int i = 0; i<size-1; i++) {
				jt[i].setText("");
			}
		
		}
	
		
	}

}
