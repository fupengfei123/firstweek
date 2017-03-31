package firstweek;

public class PersonTest {
	public static void main(String[] args) {
		Stu stu1  = new Stu("小刚",30,"男","机械一班");
		stu1.study();
		
		System.out.println("---------------");
		
		Teacher teacher = new Teacher("高老师", 29, "男",900);
		teacher.printSalary();
		
	}
}
