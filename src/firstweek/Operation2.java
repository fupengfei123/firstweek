package firstweek;

import java.util.Scanner;

public class Operation2 {
	static int[] array = new int[] { 2, 3, 4, 56, 67, 11, 22 };

	public static void main(String[] args) {
		System.out.println("*****第1题*****");
		test1();
		System.out.println("*****第2题*****");
		test2();
		System.out.println("*****第3题*****");
		int max = max(array);
		System.out.println(max);
		System.out.println("*****第4题*****");
		int min = min(array);
		System.out.println(min);
		System.out.println("*****第5题*****");
		int sum = sum(array);
		System.out.println(sum);
	}

	public static void test1() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("请输入学生的成绩：");
			int num = scanner.nextInt();
			int mark = num / 10;
			switch (mark) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("成绩不及格！");
				break;
			case 6:
				System.out.println("及格");
				break;
			case 7:
				System.out.println("一般");
				break;

			case 8:
				System.out.println("良好");
				break;
			case 9:
			case 10:
				System.out.println("优秀");
				break;
			default:
				System.out.println("请输入0~100以内的成绩！");
				break;
			}
			System.out.println("是否退出？（y/n）");
			if (scanner.next().equals("y"))
				break;
		}
	}
	
	//for循环
	public static void test2() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	// 返回数组中最大值
	public static int max(int[] array) {
		int num = array[0];
		for (int i = 1; i < array.length; i++) {
			if (num < array[i]) {
				num = array[i];
			}
		}
		return num;
	}

	// 返回数组中最小值
	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}

	// 返回数组中元素的和
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 1; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
}