package com.swingex;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ImagePrintEx extends JFrame implements ActionListener {

	private JMenuBar jmb = new JMenuBar();
	private JMenu jm = new JMenu("option");
	private JMenuItem jmi = new JMenuItem("pre-exist");
	private JMenuItem jmi1 = new JMenuItem("���Ϲ���");
	private JMenuItem jmi2 = new JMenuItem("�¿����");
	private JMenuItem jmi3 = new JMenuItem("print");
	private ImagePrint is = new ImagePrint();

	public ImagePrintEx() {

		super("image printing");
		jm.add(jmi);
		jm.add(jmi1);
		jm.add(jmi2);
		jm.add(jmi3);

		
		//�̺�Ʈ ���
		jmi.addActionListener(this);
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		jmi3.addActionListener(this);
		
		//����Ű
		jmi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, 
				ActionEvent.ALT_MASK));
		jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, 
				ActionEvent.ALT_MASK));
		jmi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, 
				ActionEvent.ALT_MASK));
		jmi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, 
				ActionEvent.ALT_MASK));
		
		
		
		jmb.add(jm);
		setJMenuBar(jmb);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("Center", is);
		setSize(500, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	if(e.getSource() == jmi) {
		
		Image ii = is.returnImage();
		is.setting(0, 0, ii.getWidth(null), ii.getHeight(null));
		is.repaint();
	}else if(e.getSource() == jmi1) {
		Image ii = is.returnImage();
		is.setting(0, ii.getWidth(null), ii.getHeight(null), 0);
		is.repaint();
		
		
	}else if(e.getSource() == jmi2) {
		
		Image ii = is.returnImage();
		is.setting( ii.getWidth(null), 0, 0, ii.getHeight(null));
		is.repaint();
		
	}else if(e.getSource() == jmi3) {
		
		PrintJob pj = Toolkit.getDefaultToolkit().getPrintJob(this, "Flower", null);
		
		Graphics printGraphics = pj.getGraphics();
		printGraphics.drawImage(is.returnImage(),0, 0, is.returnImage().getWidth(null), is.returnImage().getHeight(null), this);
		printGraphics.dispose();
		pj.end();
	}		
	}
	public static void main(String[] args) {
		new ImagePrintEx();
	}
}
