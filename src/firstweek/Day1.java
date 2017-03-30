package firstweek;

import java.util.Scanner;

import org.junit.Test;

public class Day1 {
	public static void main(String[] args) {
		
	}

	@Test
	public void isLeapYear() {
		// 判断是不是闰年
		// 能被4整除且不能被100整除
		// 能被400整除
		int year = 2017;
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
		String result = isLeapYear ? year + "是闰年" : year + "不是闰年";
		System.out.println(result);
	}

	@Test
	public void test1() {
		// 变量交换
		int num1 = 5;
		int num2 = 3;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After num1: " + num1);
		System.out.println("After num2: " + num2);

	}

	@Test
	public void test2() {
		// 定义一个三位数386
		// 分别打印百位，十位，个位
		// 注意思路
		int num = 386;
		int bai = num / 100;
		int shi = num % 100 / 10;
		int ge = num % 100 % 10;
		System.out.println("百位：" + bai);
		System.out.println("十位：" + shi);
		System.out.println("个位：" + ge);
	}

	@Test
	public void test3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入：");
		int num1 = scanner.nextInt();
		String num2 = scanner.next();
		System.out.println(num1);
		System.out.println(num2);
	}
	
	
	public void test4() {
		
	}
}
