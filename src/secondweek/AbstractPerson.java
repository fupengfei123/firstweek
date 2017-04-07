package secondweek;

public abstract class AbstractPerson {
	protected String name;
	protected int age;

	protected AbstractPerson(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	protected AbstractPerson() {
		super();
	}

	public abstract void showInfo();
}
