package firstweek;

public class Circular {
	private double radius;

	public Circular() {

	}
	
	
	public Circular(double radius) {
		super();
		this.radius = radius;
	}

	

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	// 计算周长
	public double getPerimeter() {
		double perimeter = 2 * (Math.PI) * radius;
		return perimeter;
	}

	// 计算面积
	public double getArea() {
		double area = (Math.PI) * radius * radius;
		return area;
	}
}
