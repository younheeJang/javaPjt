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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FindPane extends JPanel implements ActionListener {

	// ��� �ʵ� ����
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField jt[] = new JTextField[5];
	private JButton okayButton;
	private JButton resetButton;
	private int department = 10;

	String[] caption = { "empNum", "name", "jobGrade",  "department" , "email"};

	public FindPane() {

		setLayout(new GridLayout(7, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;
		int i;
		for (i = 0; i < size; i++) {

			jl[i] = new JLabel(caption[i]);
			jt[i] = new JTextField(15);
			jp[i] = new JPanel();
			jp[i].add(jl[i]);
			jp[i].add(jt[i]);

			add(jp[i]);

			// �ؽ�Ʈ �����Ұ�
			jt[i].setEditable(false);

			// �� �����ȣ�� �̸����� �˻��ؾ� �Է� ������ ���·� ����
			if (i == 0 || i == 1) {// 0, 1�� �ε���
				jt[i].setEditable(true);
			}

		}

		jp[size] = new JPanel();
		okayButton = new JButton("���������ȸ");
		okayButton.addActionListener(this);
		resetButton = new JButton("�ٽ��ۼ�");
		resetButton.addActionListener(this);

		jp[size].add(okayButton);
		jp[size].add(resetButton);
		add(jp[size]);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ae_type = e.getActionCommand();
		// �̺�Ʈ�� �߻��� ��ư�� ĸ�� ���� ������
		EmployeeVO evo = null;
		// �˻��� ��� ������ ������ ���̿� ��ü ����
		EmployeeDAO edvo = null;
		// �����ͺ��̽� ó���� ���� ���̿� ��ü ����

		if (ae_type.equals(okayButton.getText())) {
			// �������
			try {
				edvo = new EmployeeDAO();
				String sno = jt[0].getText().trim();
				String sname = jt[1].getText().trim();
				if (! sno.equals("") && ! sname.equals("")) {
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				} else if (!sno.equals("") && sname.equals("")) {
					// ����� �Է�
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				} else if (sno.equals("") && ! sname.equals("")) {
					// int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeName(sname);
				}
			} catch (Exception ee) {
				ee.printStackTrace();
			}

			// �ش� ����� �������� �ʴ´ٸ� �ؽ�Ʈ �ʵ� �ʱ�ȭ
			if (evo != null) {
				jt[0].setText(evo.getNo() + "");
				jt[1].setText(evo.getName() + "");
				jt[2].setText(evo.getJobGrade() + "");
				jt[3].setText(evo.getDepartment() + "");
				jt[4].setText(evo.getEmail() + "");
			} else {
				JOptionPane.showMessageDialog(this, "�˻�����");
			}
		} else if (ae_type.equals(resetButton.getText())) {
			// �ٽ� �ۼ� ��ư�� Ŭ������ ��� �ؽ�Ʈ �ʵ� �ʱ�ȭ
			int size = caption.length;
			for (int i = 0; i < size; i++) {
				jt[i].setText("");
			}
		}
	}
}
