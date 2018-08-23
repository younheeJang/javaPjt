package co.eventex;

import java.awt.event.*;

import com.awtex.WinEvent;

import java.awt.*;

public class MouseMotionEventEx extends Frame implements MouseMotionListener {

	public MouseMotionEventEx() {
		super(" MouseMotionEvent");
		addMouseMotionListener(this);
	
		WinEvent we = new WinEvent();
		addWindowListener(we);
		setSize(300, 300);
		setVisible(true);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(e.getSource() == this)
			System.out.println("X = "+e.getX()+",Y="+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if(e.getSource() == this)
			System.out.println("X = "+e.getX()+",Y="+e.getY());

	}

	public static void main(String[] args) {
		new MouseMotionEventEx();
	}
}
