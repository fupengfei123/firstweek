package firstweek;

public class Day4 {
	public static void main(String[] args) {
		Student student1 = new Student();
		//设置student1的值，没有返回值
		student1.setName("张三");
		student1.setAge(25);
		student1.setGender('男');
		//获取student1的值，有String类型的返回值
		String name1 = student1.getName();
		int age1 = student1.getAge();
		char gender1 = student1.getGender();
		System.out.println(name1 + age1 + gender1);
		
		Student student2 = new Student();
		student2.setName("李四");
		String name2 = student2.getName();
		System.out.println(name2);
	}
}
