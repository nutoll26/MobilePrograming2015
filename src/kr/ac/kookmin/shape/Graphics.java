package kr.ac.kookmin.shape;

public class Graphics {
	public void Draw(Shape s){
		System.out.print(s + "'s bounds is ");
		System.out.println("width : " + s.GetBounds().GetWidth() + ", height : " + s.GetBounds().GetHeight());
		System.out.println("Center is " + s.GetCenter().GetX() + ", " + s.GetCenter().GetY());
	}
}
