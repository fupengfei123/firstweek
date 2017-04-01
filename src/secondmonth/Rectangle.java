package secondmonth;

public class Rectangle extends Graphics{
	private double length;
	private double width;
	public Rectangle() {
		super();
	}
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void draw() {
		System.out.println("矩形的长度为： " + getLength() + ",宽度为： " + getWidth());
	}
}
