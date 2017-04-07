package secondweek;

public class Bird extends Animal{

	public Bird() {
		super();
	}

	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("我叫： " + name + " 年龄是： " + age);
	}
	
	public void fly() {
		System.out.println("我叫： " + name + " 年龄是： " + age + " 我会飞。");
	}
	
}
