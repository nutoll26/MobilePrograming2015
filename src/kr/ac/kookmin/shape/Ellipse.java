package kr.ac.kookmin.shape;

public class Ellipse extends Shape{
	private int width;
	private int height;
	
	Ellipse(Point c, int width, int height){
		center = c;
		this.width = width;
		this.height = height;
	}
	@Override
	Point GetCenter() {
		// TODO Auto-generated method stub
		return center;
	}
	@Override
	Rectangle GetBounds() {
		// TODO Auto-generated method stub
		return new Rectangle(center, width*2, height*2);
	}
	@Override
	void Draw(Graphics g) {
		// TODO Auto-generated method stub
		g.Draw(this);
	}
	
	@Override
	public String toString() {
		return "Ellipse";
	}
	
	
	
}
