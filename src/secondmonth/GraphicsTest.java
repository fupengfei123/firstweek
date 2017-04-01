package secondmonth;

public class GraphicsTest {
	public static void main(String[] args) {
		
		Graphics graphics = new Square(12);
		graphics.draw();
		
		graphics = new Rectangle(5,3);
		//把graphics1对象的类型强制转换为Square类型，用来调用square里面的方法
		graphics.draw();
		
		graphics = new Circular(6);
		graphics.draw();
	}
}
