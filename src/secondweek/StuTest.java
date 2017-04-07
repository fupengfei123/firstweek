package secondweek;

public class StuTest {
	public static void main(String[] args) {
		Stu stu = new Stu("张三",22,'男',"CN");
		System.out.println(stu);
		System.out.println("----------------------------");
		Stu stu2 = new Stu("李四", 33, '女',"CN");
		System.out.println(stu2);
		System.out.println("----------------------------");
		System.out.println(Stu.getCountry());
	}
}
