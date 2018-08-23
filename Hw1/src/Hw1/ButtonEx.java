package Hw1;

import javax.script.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonEx extends Frame implements MouseListener {
	private Panel panelGrid;
	private TextField Input, OutPut;
	private String[] btLabels = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "C", "=", "/", };

	Button[] btArr = new Button[btLabels.length];

	public ButtonEx() {

		super("Evaluate");
		setLayout(new BorderLayout()); // 레이아웃의 매개로 보더 레이아웃을 주어 차후 숫자 및 연산 기호 말고도, 입력한 연산식 및 연산의 결과 등을 볼 수 있도록 따로 공간이
										// 필요하므로, 공간 활용을 위해 보더로 잡아줌
		GridLayout grid = new GridLayout(4, 4, 10, 10); // 숫자 및 연산을 버튼으로 나타낼 시, 사용하기 위한 그리드 레이아웃. 괄호 안은 행령, 그리고 가로 세로의
														// 텀.
		panelGrid = new Panel(grid); // 숫자와 연산자들은 패널로 묶어서 관리해 줌
		Input = new TextField(); // 연산자 및 숫자 입력할 필드 공간 설정
		OutPut = new TextField(); // 엽력받은 연산식의 결과를 도출해 낼 텍스트 필드 공간 설정

		add("North", panelGrid);// 묶어 준 숫자와 연산자를 보더 레이아웃을 이용하여 위쪽으로 몰아준다.
		add("Center", Input); // 숫자 및 연산자의 입력을 보여 줄 인풋 창은 가운데로 설정한다. 보더 레이아웃 개념을 이용
		add("South", OutPut); // 역시 보더 레이아웃 개념을 이용하여 연산 결과를 맨 아래쪽으로 몰아낸다.
	/*	Input.setFont(new Font("고딕체", Font.BOLD, 30));
		OutPut.setFont(new Font("고딕체", Font.BOLD, 30));
		Input.setFont(new Font("고딕체", Font.BOLD, 30));
		*/
		
		for (int i = 0; i < btLabels.length; i++) {

			btArr[i] = new Button(btLabels[i]); // 버튼 배열의 새로운 객체를 생성하고, 매개로 버튼라벨의 배열을 넣는다.
			btArr[i].setFont(new Font("샘물", Font.BOLD, 30)); // 버튼 배열의 폰트를 지정해 준다.
			panelGrid.add(btArr[i]); // 선언해 놓은 패널로 버튼 배열을(버튼 라벨의 배열은 이미 매개로 들어가 있는 상태) 묶어준다.
			btArr[i].addMouseListener(this); // 마우스의 움직임을 감시, 혹은 주시하고 있는 인터페이스로, 버튼 배열에 마우스의 움직임을 추가하여 연동시킨다.
			btArr[i].setForeground(Color.WHITE);
			btArr[i].setBackground(Color.PINK);

			addWindowListener(new WinEvent());
			setSize(300, 300);
			setVisible(true);

		}

	}

	public static void main(String[] args) {
		new ButtonEx();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Button b = (Button) e.getSource();
		if (b.getLabel().equals("=")) {
			System.out.println(new Object());
			ScriptEngineManager mgr = new ScriptEngineManager();
			ScriptEngine engine = mgr.getEngineByName("JavaScript");
			try {
				OutPut.setText((engine.eval(Input.getText()).toString()));
			} catch (ScriptException e1) {
				Input.setText("오류 발생");
				OutPut.setText("오류 발생");
				e1.printStackTrace();
			}
			Input.setText(""); // 초기화
			return;
		} else if (b.getLabel().equals("C")) {

			Input.setText(Input.getText().substring(0, Input.getText().length() - 1)); // 텍스트설정(반환한 텍스트.인덱스로 지정하여 스트링으로
																						// 가져옴(0, 반환된 텍스트의 길이 - 1) 입력된
																						// 문자 하나씩 버튼을 통해 반환된 라벨이 C일 때마다
																						// 지워져야 하니까.
			return;

		}

		Input.setText(Input.getText() + b.getLabel());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
