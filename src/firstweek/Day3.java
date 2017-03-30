package firstweek;

import java.util.Scanner;

import org.junit.Test;

public class Day3 {
	static int[] score = { 0, 0, 1, 2, 3, 5, 4, 5, 2, 8, 7, 6, 9, 5, 4, 8, 3,
			1, 0, 2, 4, 8, 7, 9, 5, 2, 1, 2, 3, 9 };

	public static void main(String[] args) {
		getAmount();
		getOddCount();
	}

	@Test
	public void name() {
		int[] student = new int[2];
		int mark;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < student.length; i++) {
			System.out.println("请输入学生的成绩： ");
			mark = scanner.nextInt();
			student[i] = mark;
			sum = sum + mark;
		}
		int avg = sum / student.length;
		System.out.println("平均成绩为： " + avg);
	}
	
	public static void getOddCount() {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] % 2 == 0) {
				count1++;
			}else{
				count2++;
			}
		}
		System.out.println("数组中奇数的个数为：" + count2);
		System.out.println("数组中偶数的个数为：" + count1);
	}

	/**
	 * 求数组中0~9分别出现的次数
	 */
	public static void getAmount() {
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
		for (int i = 0; i < score.length; i++) {
			switch (score[i]) {
			case 0:
				num[0]++;
				break;
			case 1:
				num[1]++;
				break;
			case 2:
				num[2]++;
				break;
			case 3:
				num[3]++;
				break;
			case 4:
				num[4]++;
				break;
			case 5:
				num[5]++;
				break;
			case 6:
				num[6]++;
				break;
			case 7:
				num[7]++;
				break;
			case 8:
				num[8]++;
				break;
			case 9:
				num[9]++;
				break;

			default:
				break;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + "出现的次数为：" + num[i]);
		}
	}
}
