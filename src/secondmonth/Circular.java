package secondmonth;

public class Circular extends Graphics{
	private double radius;

	public Circular() {
		super();
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
	
	public void draw() {
		System.out.println("圆形的半径为： " + getRadius());
	}
}
