package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	Rectangle(Point c, int width, int height){
		center = c;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public Point GetCenter() {
		// TODO Auto-generated method stub
		return center;
	}

	@Override
	public Rectangle GetBounds() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	void Draw(Graphics g) {
		// TODO Auto-generated method stub
		g.Draw(this);
	}
	
	@Override
	public String toString() {
		return "Rectangle";
	}
	
	public int GetWidth(){
		return this.width;
	}
	
	public int GetHeight(){
		return this.height;
	}
}
