package firstweek;

public class Fish extends Animal {

	public Fish(String name, String color) {
		super(name,color);
	}

	public void pop() {
		System.out.println(getColor() + "它正在吹泡泡！");
	}
}
