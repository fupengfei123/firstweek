package secondweek;

public class Student1 extends Person1{
	private String classname;

	public Student1() {
		super();
	}

	public Student1(String name, int age,String classname) {
		super(name,age);
		this.classname = classname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	@Override
	public void showInfo() {
		System.out.println("我叫： " + name + " 年龄是： " + age + " 我在： " + classname + "学习！");
	}

	@Override
	public void die() {
		System.out.println("人有生老病死。");
		
	}
}
