package com.awtex;

import java.awt.*;

public class MenuEx extends Frame {

	MenuBar mb = new MenuBar();

	// �޴� ����
	private Menu file = new Menu("File");
	private Menu edit = new Menu("tools");
	private Menu view = new Menu("view");
	private Menu help = new Menu("help");

	private MenuItem fnew = new MenuItem("new file");
	private MenuItem fopen = new MenuItem("file open");
	private MenuItem fsave = new MenuItem("file save");
	private MenuItem fsaveas = new MenuItem("save as new file name");
	private MenuItem fexit = new MenuItem("file exit");

	private Menu ecolor = new Menu("color");
	private Menu esize = new Menu("size");

	private CheckboxMenuItem ecred = new CheckboxMenuItem("red");
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("green");
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("blue");

	private CheckboxMenuItem es10 = new CheckboxMenuItem("10");
	private CheckboxMenuItem es20 = new CheckboxMenuItem("20");
	private CheckboxMenuItem es30 = new CheckboxMenuItem("30");

	
	
	public MenuEx() {
		super("Menu Composition");

		//when you set the menu, you can use the setmenubar method. 
		setMenuBar(mb);
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);
		
		ecolor.add(ecred);
		ecolor.add(ecgreen);
		ecolor.add(ecblue);
		
		esize.add(es10);
		esize.add(es20);
		esize.add(es30);

		//Į��� �������� �и��� ����
		edit.add(ecolor);
		edit.addSeparator();
		edit.add(esize);
		
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.add(fsaveas);
		file.addSeparator();
		file.add(fexit);
	
		//���̾ƿ� ����
		setLayout(new BorderLayout());//�������� ���ʴ�� ������ ���̹Ƿ� �׸��巹�̾ƿ��� �ƴ� �������̾ƿ��� ���
		add("North", new Label("Cheer up!", Label.CENTER));
		add("Center", new TextArea());
		
		Panel p = new Panel(new GridLayout(1, 2));
		p.add(new Button("Check"));
		p.add(new Button("Cancel"));
		add("South",p);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MenuEx();
	}
}
