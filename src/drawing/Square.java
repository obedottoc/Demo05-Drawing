package drawing;

import java.awt.Graphics;

public class Square extends Shape {
int x;
int y;
int size;
	public Square(int x,int y,int size)
	{
		this.x=x;
		this.y=y;
		this.size=size;
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(x, y, size, size);
	}

}
