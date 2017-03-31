package firstweek;

public class Fish extends Animal {

	public Fish(String name, String color) {
		super(name,color);
	}

	public void pop(String name, String color) {
		System.out.println("颜色是： " + color + "的" + name + ": 的鱼正在吹泡泡！");
	}
}
