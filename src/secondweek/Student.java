package secondweek;

public abstract class Student extends AbstractPerson{
	
	protected String className;

	public Student(String name, int age, String className) {
		super(name, age);
		this.className = className;
	}

	public Student() {
		super();
	}

	public void study() {
		System.out.println("我是学生，我会学习！");
	}
}
