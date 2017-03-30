package studentManager;

import java.util.Scanner;

public class StudentTest {
	static Scanner scanner = new Scanner(System.in);

	// 主方法调用
	public static void main(String[] args) {
		Student[] students = new Student[2];
		inputStudentInfos(students);
		showStudentInfos(students);
		selectStudentInfos(students);
	}

	// 输入学生信息
	public static void inputStudentInfos(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			Student stu = new Student();
			System.out.println("请输入学生姓名： ");
			stu.setName(scanner.next());
			System.out.println("请输入学生年龄： ");
			stu.setAge(scanner.nextInt());
			System.out.println("请输入学生性别： ");
			stu.setGender(scanner.next());
			students[i] = stu;
		}
	}

	// 展示学生信息
	public static void showStudentInfos(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println("学生姓名：  " + students[i].getName());
			System.out.println("学生年龄：  " + students[i].getAge());
			System.out.println("学生性别：  " + students[i].getGender());
		}
	}

	// 查询学生信息
	public static void selectStudentInfos(Student[] students) {
		while (true) {
			System.out.println("根据条件查询学生信息： ");
			System.out.println("1.根据姓名查找： ");
			System.out.println("2.根据年龄查找： ");
			System.out.println("3.根据性别查找： ");
			System.out.println("请输入1~3：  ");
			int mark = scanner.nextInt();
			switch (mark) {
			case 1:
				System.out.println("请输入学生姓名： ");
				String str1 = scanner.next();
				boolean isSeachByNameFound = false;
				for (int i = 0; i < students.length; i++) {
					Student student = students[i];
					if (str1.equals(student.getName())) {
						System.out.println(student.getName());
						System.out.println(student.getAge());
						System.out.println(student.getGender());
						isSeachByNameFound = true;
					}
				}
				if (isSeachByNameFound == false) {
					System.out.println("查无此人！");
				}
				break;
			case 2:
				System.out.println("请输入学生年龄： ");
				int num = scanner.nextInt();
				boolean isSeachByAgeFound = false;
				for (int i = 0; i < students.length; i++) {
					Student student = students[i];
					if (num == student.getAge()) {
						System.out.println(student.getName());
						System.out.println(student.getAge());
						System.out.println(student.getGender());
						isSeachByAgeFound = true;
					}
				}
				if (isSeachByAgeFound == false) {
					System.out.println("查无此人！");
				}
				break;
			case 3:
				System.out.println("请输入学生性别： ");
				String str2 = scanner.next();
				boolean isSeachByGenderFound = false;
				for (int i = 0; i < students.length; i++) {
					Student student = students[i];
					if (str2.equals(student.getGender())) {
						System.out.println(student.getName());
						System.out.println(student.getAge());
						System.out.println(student.getGender());
						isSeachByGenderFound = true;
					}
				}
				if (isSeachByGenderFound == false) {
					System.out.println("查无此人！");
				}
				break;
			default:
				System.out.println("请输入1~3 ！");
				break;
			}
			System.out.println("是否退出？");
			if (scanner.nextInt() == 0)
				break;
		}
	}
}
