package secondweek;

public class AnimalTest {
	public static void main(String[] args) {
		Animal stu = new Student1("lisi", 22,"机械一班");
		stu.showInfo();
		System.out.println("------------");
		Animal animal = new Bird("百灵鸟", 3);
		Bird bird = (Bird) animal;
		bird.fly();
		
		Person1 student = new Student1("zhangsan", 22,"机械一班");
		student.showInfo();
		System.out.println("------------");
		student.walk();
		System.out.println("------------");
		student.die();
	}
}
