import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;




	//constructor(s):
	
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.velocity = 0;  
    }

    // Methods
    public void addVelocity(int amount) {
        velocity += amount; 
    }
    public void draw(Graphics g) {
        g.setColor(Color.red);
		g.fillRect(x, y, width, height);
    }


	public void setX(int newX){
		x = newX;
	}

    public int getX() {
		return x;
    }
	public int getY() {
		return y;
    }
	public int getWidth(){
		return width;
	}
	public int getHeight() {
		return height;
    }
	public int getVelocity(){
		return velocity;
	}
	public void move (){
		x+=0;
		y+=0;
	} 
public void setVelocity(int speed) {
	velocity = speed; 
}

    }

