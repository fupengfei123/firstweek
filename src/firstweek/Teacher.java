 package firstweek;

public class Teacher extends Person{
	private int salary;
	
	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String gender,int salary) {
		super(name,age,gender);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void printSalary() {
		eatFood();
		System.out.println(getName() + "的薪资是： " + salary);
	}
}
