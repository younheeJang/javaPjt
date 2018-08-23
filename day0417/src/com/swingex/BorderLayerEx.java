package com.swingex;

import java.awt.*;
import javax.swing.border.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayerEx extends JFrame {

	private JButton[] jb = new JButton[6];
	
	
	public BorderLayerEx() {

		super("Variety for Line Shape  ");

		//필수.
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3, 2, 10, 10));
		
		for(int i =0; i < jb.length;i++) {
			jb[i] = new JButton(i+1+"번 버튼");
			con.add(jb[i]);
		}
		
		EmptyBorder eb = new EmptyBorder(10, 10, 10, 10);
		jb[0].setBorder(eb);
		
		LineBorder lb = new LineBorder(Color.RED, 5);
		jb[1].setBorder(lb);
		
		EtchedBorder eb1 = new EtchedBorder();
		jb[2].setBorder(eb1);
		
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
		jb[3].setBorder(bb);
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		jb[4].setBorder(sbb);
		
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.BLACK);
		jb[5].setBorder(mb);
		
		
		setSize(300, 300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new BorderLayerEx();

	}

}
