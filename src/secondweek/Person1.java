package secondweek;

public abstract class Person1 extends Animal{

	public Person1() {
		super();
	}

	public Person1(String name, int age) {
		super(name, age);
	}

	@Override
	public void showInfo() {
		System.out.println("我叫： " + name + " 年龄是： " + age);
	}
	
	public void walk() {
		System.out.println("我是人，我叫： " + name + ",我的年龄是：" + age + "岁了！");
	}
	
	public abstract void die();
}
