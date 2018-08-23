package com.swingex;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class JPMInputStreamEx extends JFrame implements ActionListener, Runnable {

	private JTextArea jta = new JTextArea();

	private JScrollPane jsp = new JScrollPane(jta);
	private JButton jbt = new JButton("Loading");
	private JButton jbt1 = new JButton("End");
	private JFileChooser jfc = new JFileChooser();
	private File f;
	private ProgressMonitorInputStream pmi;
	private BufferedInputStream bis;

	public JPMInputStreamEx() {

		super("File Loading");

		setForm();
		jbt.addActionListener(this);

	}

	public void setForm() {
		add("Center", jsp);
		jsp.setBorder(new TitledBorder("Loading..."));
		JPanel p = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p.add(jbt);
		p.add(jbt1);
		add("South", p);
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(d.width / 2 - 150, d.height / 2 - 100);

	}

	@Override
	public void run() {
		ProgressMonitor pm = pmi.getProgressMonitor();
		pm.setNote("Started");

		int imsi = 0;

		int kk = 0;

		jta.setText(""); // √ ±‚»≠

		long size = f.length();
		jta.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		try {
			while ((imsi = pmi.read()) != -1) {
				pm.setNote((int) (kk / (float) size * 100) + "%");

				pm.setProgress(kk++);
				jta.append("" + (char) imsi);

				try {
					Thread.sleep(10);
				} catch (InterruptedException ie2) {
					ie2.printStackTrace();
				}

			}

		} catch (IOException io) {
			io.printStackTrace();
		}
		pm.close();
		jta.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()== jbt) {
			jfc.showOpenDialog(this);
			f = jfc.getSelectedFile();
			
			if(f == null)return;
			try {
				pmi = new ProgressMonitorInputStream(this, "Loading" + f.getName()+"......", new FileInputStream(f));
				
			} catch (IOException io) {
				
				io.printStackTrace();
			}
			new Thread(this).start();
		} else if(e.getSource() == jbt1) {
			System.exit(0);
		}
		
		
	}

	public static void main(String[] args) {

		new JPMInputStreamEx();
	}

}
