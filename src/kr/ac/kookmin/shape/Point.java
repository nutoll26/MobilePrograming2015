package kr.ac.kookmin.shape;

public class Point {
	private int x;
	private int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	Point(){
		this(0,0);
	}
	
	public int GetX(){
		//System.out.println("x : " + this.x);
		return x;
	}
	
	public int GetY(){
		//System.out.println("y : " + this.y);
		return y;
	}
	
	public void SetX(int x){
		this.x = x;
	}
	
	public void SetY(int y){
		this.y = y;
	}
}
