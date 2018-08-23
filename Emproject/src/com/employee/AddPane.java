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

//패널로 사원 정보 입력을 위한 클래스 구성
public class AddPane extends JPanel implements ActionListener, ItemListener {

	// Swing 멤버구성
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField jt[] = new JTextField[5];
	private JButton okayButton;
	private JButton resetButton;
	private int department = 10;

	// 입력 받을 항목 제목
	String[] caption = { "name", "jobGrade", "email", "department" };

	// 애드 패널
	public AddPane() {
		setLayout(new GridLayout(6, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;
		// 입력받을 개수

		// 텍스트 필드와 레이블을 패널에 묶어서 AddPane에 붙임
		int i;
		for (i = 0; i < size - 1; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			jt[i] = new JTextField(15);
			jp[i].add(jl[i]);
			jp[i].add(jt[i]);
			add(jp[i]);
		}
		//공간을 준 것임 
		jp[i] = new JPanel();
		jl[i] = new JLabel(caption[i]);
		jp[i].add(jl[i]);
		add(jp[i]);

		JComboBox combo = new JComboBox();
		combo.addItem("부서번호를 선택하세요");

		for (int c = 1; c <= 5; c++) {
			combo.addItem(c * 10); // 부서번호 10~50번까지 10 20 30 40 50 부서번호 추가함
		}

		jp[i].add(combo);
		combo.addItemListener(this);

		jp[size] = new JPanel();
		okayButton = new JButton("저장하기");
		okayButton.addActionListener(this);
		resetButton = new JButton("다시 작성");
		resetButton.addActionListener(this);

		jp[size].add(okayButton);
		jp[size].add(resetButton);
		add(jp[size]);

	}

	// 콤보 박스에 대한 이벤트 처리
	@Override
	public void itemStateChanged(ItemEvent ie) {

		if (ie.getStateChange() == ie.SELECTED) {
			department = Integer.parseInt(ie.getItem().toString());
		}

	}

	
	// 버튼에 대한 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent ae) {
		String ae_type = ae.getActionCommand();
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;
		
		if(ae_type.equals(okayButton.getText())) {
			//저장하기 버튼이 클릭되었을 경우
			try {
				evo = new EmployeeVO(0, jt[0].getText(), jt[1].getText(),  department,  jt[2].getText());
				edvo = new EmployeeDAO();
				edvo.getEmployeeregiste(evo);
			} catch (Exception e) {
				e.printStackTrace();
			}if(edvo != null)
		
		
		JOptionPane.showMessageDialog(this,  jt[0].getText()+"님이 성공적으로 추가");
		}else if(ae_type.equals(resetButton.getText())){
			int size = caption.length;
		
			for(int i = 0; i<size-1; i++) {
				jt[i].setText("");
			}
		
		}
	
		
	}

}
