package firstweek;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(20);
		rectangle.setWidth(10);
		double num1 = rectangle.getPerimeter();
		double num2 = rectangle.getArea();
		System.out.println(num1);
		System.out.println(num2);
	}
}
