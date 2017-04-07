package studentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentListTest {
	static Scanner scanner = new Scanner(System.in);

	// 主方法调用
	public static void main(String[] args) {
		List<StudentList> list = new ArrayList<StudentList>();
		inputStudentInfos(list);
		showStudentInfos(list);
		selectStudentInfos(list);
	}

	// 添加学生
	public static List<StudentList> inputStudentInfos(List<StudentList> list) {
		StudentList stu1 = new StudentList("xiaoming", 22, "nan");
		StudentList stu2 = new StudentList("xiaohong", 25, "nv");
		list.add(stu1);
		list.add(stu2);
		return list;
	}

	// 展示学生信息
	public static void showStudentInfos(List<StudentList> list) {
		System.out.println("-------------学生信息-------------");
		for (StudentList student : list) {
			System.out.println(student);
		}
	}

	// 查询学生
	public static void selectStudentInfos(List<StudentList> list) {
		while (true) {
			System.out.println("根据条件查询学生信息： ");
			System.out.println("0.退出！");
			System.out.println("1.根据姓名查找： ");
			System.out.println("2.根据年龄查找： ");
			System.out.println("3.根据性别查找： ");
			System.out.println("请输入0~3：  ");
			int mark = scanner.nextInt();
			if (mark == 0) {
				System.out.println("程序退出！");
				break;
			}
			switch (mark) {
			case 1:// 根据姓名查找
				System.out.println("请输入学生姓名： ");
				String name = scanner.next();
				boolean isSeachByNameFound = false;
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						System.out.println(list.get(i));
						isSeachByNameFound = true;
					}
				}
				if (isSeachByNameFound == false) {
					System.out.println("查无此人！");
				}
				break;

			case 2: // 根据年龄查找
				System.out.println("请输入学生年龄： ");
				int age = scanner.nextInt();
				boolean isSeachByAgeFound = false;
				for (int i = 0; i < list.size(); i++) {
					if (age == list.get(i).getAge()) {
						System.out.println(list.get(i));
						isSeachByAgeFound = true;
					}
				}
				if (isSeachByAgeFound == false) {
					System.out.println("查无此人！");
				}
				break;
			case 3:// 根据性别查找
				System.out.println("请输入学生性别： ");
				String str2 = scanner.next();
				boolean isSeachByGenderFound = false;
				for (int i = 0; i < list.size(); i++) {
					if (str2.equals(list.get(i).getGender())) {
						System.out.println(list.get(i));
						isSeachByGenderFound = true;
					}
				}
				if (isSeachByGenderFound == false) {
					System.out.println("查无此人！");
				}
				break;
			default:
				System.out.println("请输入0~3 ！");
				break;
			}
		}
	}
}
