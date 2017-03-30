package firstweek;

import java.util.Scanner;

import org.junit.Test;

public class Day2 {
	public static void main(String[] args) {

	}

	@Test
	public void whileDemo1() {
		int i = 1;// 循环条件的初始化
		int sum = 0;
		while (i <= 100) {// 循环条件的控制
			sum = sum + i;
			i++;
		}
		System.out.println("1~100的和为：" + sum);
	}

	@Test
	public void whileDemo2() {
		int i = 1;// 循环条件的初始化
		while (i <= 9) {// 循环条件的控制
			int sum = i * 9;
			System.out.println(i + " * 9 = " + sum);
			i++;
		}
	}

	@Test
	public void whileDemo3() {
		int random = (int) (Math.random() * 100 + 1);
		System.out.println("生成的随机数为：" + random);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = scanner.nextInt();

		while (num != random) {
			if (num == 0) {
				System.out.println("下次再来！");
				return;
			}
			if (num > random) {
				System.out.println("太大了！");
			} else {
				System.out.println("太小了！");
			}
			System.out.println("继续猜！");
			num = scanner.nextInt();
		}
		System.out.println("恭喜你，猜对了！");
	}

	@Test
	public void doWhile() {
		Scanner scanner = new Scanner(System.in);
		int pwd;
		do {
			System.out.println("请输入密码：");
			pwd = scanner.nextInt();
		} while (123 != pwd);
		System.out.println("over!");
	}

	// 1~100以内7的倍数
	@Test
	public void test1() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.print("7的倍数的个数为：" + count);
	}

	@Test
	public void test2() {
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test
	public void test3() {
		Scanner scanner = new Scanner(System.in);
		int year;// 定义年份
		int month;// 定义月份
		System.out.println("请输入年份：");
		year = scanner.nextInt();
		System.out.println("请输入月份：");
		month = scanner.nextInt();
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "月份共有31天！");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "月份共有30天！");
			break;
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("今年的二月共有29天");
			} else {
				System.out.println("今年的二月共有28天");
			}
			break;
		default:
			System.out.println("请输入1~12以内的数字！");
			break;
		}
	}
	
	@Test
	public void test6() {
		int[] array = new int[]{22,58,6,94,236,78,45,88};
		for(int i = 0;i < array.length;i++){//数组遍历顺序
			System.out.println(array[i]);
		}
		for(int i = array.length - 1;i >= 0;i--){//遍历数组倒序
			System.out.println(array[i]);
		}
	}
}
