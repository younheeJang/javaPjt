package co.eventex;

import java.awt.event.*;

import com.awtex.WinEvent;

import java.awt.*;

public class ActionEventEx3 extends Frame implements ActionListener {
	private MenuBar mb = new MenuBar();
	private Menu File = new Menu("file");
	private MenuItem now = new MenuItem("Now");
	private MenuItem exit = new MenuItem("Exit");

	public ActionEventEx3() {

		super("MenuEvent");

		setMenuBar(mb);
		mb.add(File);
		File.add(now);
		File.addSeparator();
		File.add(exit);

		exit.addActionListener(this);
		now.addActionListener(this);
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource() == now) {
			System.out.println("Do not Sleep");
		
		}else if (e.getSource()==exit) {
		
			
			System.exit(0);
		}

		
	}

	public static void main(String[] args) {

		new ActionEventEx3();

	}

}
