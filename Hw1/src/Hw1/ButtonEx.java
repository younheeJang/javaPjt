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
		setLayout(new BorderLayout()); // ���̾ƿ��� �Ű��� ���� ���̾ƿ��� �־� ���� ���� �� ���� ��ȣ ����, �Է��� ����� �� ������ ��� ���� �� �� �ֵ��� ���� ������
										// �ʿ��ϹǷ�, ���� Ȱ���� ���� ������ �����
		GridLayout grid = new GridLayout(4, 4, 10, 10); // ���� �� ������ ��ư���� ��Ÿ�� ��, ����ϱ� ���� �׸��� ���̾ƿ�. ��ȣ ���� ���, �׸��� ���� ������
														// ��.
		panelGrid = new Panel(grid); // ���ڿ� �����ڵ��� �гη� ��� ������ ��
		Input = new TextField(); // ������ �� ���� �Է��� �ʵ� ���� ����
		OutPut = new TextField(); // ���¹��� ������� ����� ������ �� �ؽ�Ʈ �ʵ� ���� ����

		add("North", panelGrid);// ���� �� ���ڿ� �����ڸ� ���� ���̾ƿ��� �̿��Ͽ� �������� �����ش�.
		add("Center", Input); // ���� �� �������� �Է��� ���� �� ��ǲ â�� ����� �����Ѵ�. ���� ���̾ƿ� ������ �̿�
		add("South", OutPut); // ���� ���� ���̾ƿ� ������ �̿��Ͽ� ���� ����� �� �Ʒ������� ���Ƴ���.
	/*	Input.setFont(new Font("���ü", Font.BOLD, 30));
		OutPut.setFont(new Font("���ü", Font.BOLD, 30));
		Input.setFont(new Font("���ü", Font.BOLD, 30));
		*/
		
		for (int i = 0; i < btLabels.length; i++) {

			btArr[i] = new Button(btLabels[i]); // ��ư �迭�� ���ο� ��ü�� �����ϰ�, �Ű��� ��ư���� �迭�� �ִ´�.
			btArr[i].setFont(new Font("����", Font.BOLD, 30)); // ��ư �迭�� ��Ʈ�� ������ �ش�.
			panelGrid.add(btArr[i]); // ������ ���� �гη� ��ư �迭��(��ư ���� �迭�� �̹� �Ű��� �� �ִ� ����) �����ش�.
			btArr[i].addMouseListener(this); // ���콺�� �������� ����, Ȥ�� �ֽ��ϰ� �ִ� �������̽���, ��ư �迭�� ���콺�� �������� �߰��Ͽ� ������Ų��.
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
				Input.setText("���� �߻�");
				OutPut.setText("���� �߻�");
				e1.printStackTrace();
			}
			Input.setText(""); // �ʱ�ȭ
			return;
		} else if (b.getLabel().equals("C")) {

			Input.setText(Input.getText().substring(0, Input.getText().length() - 1)); // �ؽ�Ʈ����(��ȯ�� �ؽ�Ʈ.�ε����� �����Ͽ� ��Ʈ������
																						// ������(0, ��ȯ�� �ؽ�Ʈ�� ���� - 1) �Էµ�
																						// ���� �ϳ��� ��ư�� ���� ��ȯ�� ���� C�� ������
																						// �������� �ϴϱ�.
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
