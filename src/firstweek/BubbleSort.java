package firstweek;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {

	//for循环
	@Test
	public void test1() {
		int sum = 0;
		for (int i = 0; i < 50; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
	}
	
	//while循环
	@Test
	public void test2() {
		int i = 1;
		int sum = 0;
		while (i < 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	@Test
	// 冒泡排序
	public void bubbleSort() {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		int temp = 0;// 变量初始化
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	@Test
	// 冒泡排序
	public void bubbleSort1() {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a);
			System.out.print(a[i] + " ");
		}
	}
}
