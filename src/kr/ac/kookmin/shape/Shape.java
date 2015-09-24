package kr.ac.kookmin.shape;

public abstract class Shape {
	protected Point center;
	
	abstract Point GetCenter();
	abstract Rectangle GetBounds();
	abstract void Draw(Graphics g);
}
