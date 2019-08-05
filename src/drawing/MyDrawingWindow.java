package drawing;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyDrawingWindow extends Frame implements WindowListener,MouseListener,KeyListener {

	char state;
	ArrayList<Shape> shapes;
	
	public MyDrawingWindow()
	{
		this.addWindowListener(this);
		this.addMouseListener(this);
		this.addKeyListener(this);
		state='r';
		shapes=new ArrayList<Shape>();
	}
	public void paint(Graphics g)
	{
		Shape s;
		int i;
		super.paint(g);
		
		for(i=0;i<shapes.size();i++)
		{
			s=shapes.get(i);
			s.draw(g);
		}
		//g.drawRect(10, 10, 300, 300);
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
		int x[]=new int[3];
		int y[]=new int[3];
		g=this.getGraphics();
		switch(state)
		{
		case 'r':
			g.drawRect(e.getX(), e.getY(),30 , 30);
			shapes.add(new Square(e.getX(), e.getY(),30));
			break;
		case 'c':
			g.drawOval(e.getX(), e.getY(),30 , 30);
			shapes.add(new Circle(e.getX(), e.getY(),15));
			break;
		case 't':
			x[0]=e.getX()-25;
			y[0]=e.getY();
			
			x[1]=e.getX()+25;
			y[1]=e.getY();
			
			x[2]=e.getX();
			y[2]=e.getY()-25;
			
			g.drawPolygon(x,y,3);
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
		case 't':
			state='t';
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
