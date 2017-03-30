package firstweek;

import java.util.Scanner;

public class Day3StudentTest {

	public static void main(String[] args) {
		Day3Student[] students = new Day3Student[2];
		inputStudentInfos(students);
		printStudentInfos(students);
	}

	private static void inputStudentInfos(Day3Student[] students) {
		for (int i = 0; i < students.length; i++) {
			// 把学生类实例化，也就是创建对象
			Day3Student student = new Day3Student();
			Scanner scanner = new Scanner(System.in);
			System.out.print("请输入第" + (i + 1) + "个学生姓名： ");
			student.name = scanner.next();
			System.out.print("请输入第" + (i + 1) + "个学生年龄： ");
			student.age = scanner.nextInt();
			System.out.print("请输入第" + (i + 1) + "个学生性别： ");
			student.gender = scanner.next();
			// 把学生信息添加到数组里面
			students[i] = student;
		}
	}

	private static void printStudentInfos(Day3Student[] students) {
		for (int i = 0; i < students.length; i++) {
			Day3Student student = students[i];
			System.out.println("第 " + (i + 1) + "个学生的姓名： " + student.name);
			System.out.println("第 " + (i + 1) + "个学生的年龄： " + student.age);
			System.out.println("第 " + (i + 1) + "个学生的性别： " + student.gender);
		}
	}
}
