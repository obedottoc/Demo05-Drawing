package drawing;

import java.awt.*;
import java.awt.event.*;

class MyDrawingWindow extends Frame implements WindowListener,MouseListener,KeyListener {

	char state;
	
	public MyDrawingWindow()
	{
		this.addWindowListener(this);
		this.addMouseListener(this);
		this.addKeyListener(this);
		state='r';
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.drawRect(10, 10, 300, 300);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g;
		g=this.getGraphics();
		switch(state)
		{
		case 'r':
			g.drawRect(e.getX(), e.getY(),30 , 30);
			break;
		case 'c':
			g.drawOval(e.getX(), e.getY(),30 , 30);
			break;
		}

	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar())
		{
		case 'c':
			state='c';
			break;
		case 'r':
			state='r';
			break;			
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
