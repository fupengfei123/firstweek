package secondweek;

public class Teacher extends AbstractPerson{
	public Teacher(String name, int age) {
		super(name, age);
	}

	public void teach() {
		System.out.println("我是老师，我会教书！");
	}

	@Override
	public void showInfo() {
		System.out.println("我是继承AbstractPerson类的showInfo()方法！" + name + age);
	}
}
