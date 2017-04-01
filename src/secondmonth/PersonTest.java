package secondmonth;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testMethod3() {

		Person person1 = new Student();
		person1.name = "zhangsan";
		person1.age = 21;
		print(person1);

		Person person2 = new Teacher();
		person2.name = "lisi";
		person2.age = 20;
		print(person2);
	}

	public void print(Person person) {
		System.out.println(person.name);
		System.out.println(person.age);
	}
}
