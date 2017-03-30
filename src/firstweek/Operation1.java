package firstweek;

import java.util.Scanner;

public class Operation1 {
	/**
	 * 1.编写一个收银台收款程序，定义输入--单价，数量，金额 定义输出--应收金额，找零，使用double类型 2.当总价>=500时打八折
	 * 3.考虑程序出现异常的情况: 若收款金额大于应收金额，则计算找零后输出 若收款金额小于应收金额，输出错误信息
	 */
	public static void main(String[] args) {
		getMoney();
	}

	public static void getMoney() {
		double price;// 商品单价
		double amount;// 商品数量
		double receivable;// 商品总金额

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入商品的单价：");
			price = scanner.nextDouble();
			System.out.println("请输入商品的数量：");
			amount = scanner.nextDouble();
			receivable = price * amount;
			System.out.println("商品总金额为：" + receivable);

			if (receivable >= 500) {
				double paymoney = receivable * 0.8;
				System.out.println("打折后的金额为：" + paymoney);
				System.out.println("请输入收款金额：");
				double money = scanner.nextDouble();
				if (money >= paymoney) {
					System.out.println("找零：" + (money - paymoney));
					System.out.println("谢谢光临！！！");
				} else {
					System.out.println("金额不足！");
				}
			} else {
				System.out.println("应收费的金额为：" + receivable);
				System.out.println("请输入收款金额：");
				double money = scanner.nextDouble();
				if (money >= receivable) {
					System.out.println("找零：" + (money - receivable));
					System.out.println("谢谢光临！！！");
				} else {
					System.out.println("金额不足！");
				}
			}
			System.out.println("是否退出？(y/n)");
			if (scanner.next().equals("y"))
				break;
		}
	}
}
