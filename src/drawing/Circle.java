package drawing;

import java.awt.Graphics;

public class Circle extends Shape{
int x;
int y;
int radius;

	public Circle(int x1,int y1,int r)
	{
		x=x1;
		y=y1;
		radius=r;
	}
@Override
public void draw(Graphics g) {
	// TODO Auto-generated method stub
	g.drawOval(x, y, 2*radius, 2*radius);
}
	
}
