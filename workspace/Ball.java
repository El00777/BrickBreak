import java.awt.*;

public class Ball {
	//your code here!
	private int x;
	private  int y;
	private int size;
	private int xVelocity;
	private int yVelocity;
	
	//don't forget you need instance variables:
	
	
	//constructor(s):
	public Ball (int x,int y, int size ){
		this.x=x;
		this.y=y;
		this.size= size;
		xVelocity=1;
		yVelocity=1;

	}
	public void draw(Graphics g){
		g.setColor(Color.blue);
		g.fillOval(x, y, size, size);
	}

	public int  getYpos(){
		return y;

	}
	public int  getXpos(){
		return x;

	}
	public int getSize() {
		return size;
	}
	public void setX(int newX){
		x = newX;
	}
	
	public void move(){
		x += xVelocity;
		y += yVelocity;
	}
  // Reverse the X direction
  public void reverseX() {
	xVelocity = -xVelocity;
}

// Reverse the Y direction
public void reverseY() {
	yVelocity = -yVelocity;
}
public void setXVelocity(int xVelocity) {
	this.xVelocity = xVelocity;
}

public void setYVelocity(int yVelocity) {
	this.yVelocity = yVelocity;
}
public void setY(int digit){
	this.y= digit;
}
	
}

