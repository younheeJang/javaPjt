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

	// 멤버 필드 구성
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

			// 텍스트 편집불가
			jt[i].setEditable(false);

			// 단 사원번호와 이름으로 검색해야 입력 가능한 상태로 만듦
			if (i == 0 || i == 1) {// 0, 1은 인데스
				jt[i].setEditable(true);
			}

		}

		jp[size] = new JPanel();
		okayButton = new JButton("사원정보조회");
		okayButton.addActionListener(this);
		resetButton = new JButton("다시작성");
		resetButton.addActionListener(this);

		jp[size].add(okayButton);
		jp[size].add(resetButton);
		add(jp[size]);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ae_type = e.getActionCommand();
		// 이벤트가 발생한 버튼의 캡션 값을 가져옴
		EmployeeVO evo = null;
		// 검색한 사원 정보를 저장할 브이오 객체 생성
		EmployeeDAO edvo = null;
		// 데이터베이스 처리를 위한 디에이오 객체 생성

		if (ae_type.equals(okayButton.getText())) {
			// 사원정보
			try {
				edvo = new EmployeeDAO();
				String sno = jt[0].getText().trim();
				String sname = jt[1].getText().trim();
				if (! sno.equals("") && ! sname.equals("")) {
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				} else if (!sno.equals("") && sname.equals("")) {
					// 사번만 입력
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				} else if (sno.equals("") && ! sname.equals("")) {
					// int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeName(sname);
				}
			} catch (Exception ee) {
				ee.printStackTrace();
			}

			// 해당 사원이 존재하지 않는다면 텍스트 필드 초기화
			if (evo != null) {
				jt[0].setText(evo.getNo() + "");
				jt[1].setText(evo.getName() + "");
				jt[2].setText(evo.getJobGrade() + "");
				jt[3].setText(evo.getDepartment() + "");
				jt[4].setText(evo.getEmail() + "");
			} else {
				JOptionPane.showMessageDialog(this, "검색실패");
			}
		} else if (ae_type.equals(resetButton.getText())) {
			// 다시 작성 버튼을 클릭했을 경우 텍스트 필드 초기화
			int size = caption.length;
			for (int i = 0; i < size; i++) {
				jt[i].setText("");
			}
		}
	}
}
