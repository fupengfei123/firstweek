package firstweek;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {

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

	//计算周长
	public double getPerimeter() {
		double perimeter = (length + width) * 2;
		return perimeter;
	}
	
	//计算面积
	public double getArea() {
		double area = length * width;
		return area;
	}
}
