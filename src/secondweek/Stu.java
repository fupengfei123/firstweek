package secondweek;

public class Stu {
	private String name;
	private int age;
	private char gender;
	private static String country = "CN";
	
	public Stu() {
		super();
	}

	public Stu(String name, int age, char gender, String country) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Stu.country = country;
	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + ", gender=" + gender
				+ ", country=" + country + "]";
	}

	
}
