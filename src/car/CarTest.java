package car;

import java.util.Scanner;

public class CarTest { 
	
	//主方法调用
	public static void main(String[] args) {
		Car[] cars = new Car[2];
		inputCarInfos(cars);
		show(cars);
		startup(cars);
	}

	//控制台获取汽车信息并存到数组
	private static void inputCarInfos(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			Car car = new Car();
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入汽车的品牌： ");
			car.brand = scanner.next();
			System.out.println("请输入汽车的价格： ");
			car.price = scanner.nextDouble();
			System.out.println("请输入汽车的颜色： ");
			car.color = scanner.next();
			cars[i] = car;
		}
	}
	
	//展示数组里面汽车的信息
	private static void show(Car[] cars) {
		for (int i = 0; i < cars.length; i++) {
			System.out.println("品牌是 ：" + cars[i].brand);
			System.out.println("价格是 ：" + cars[i].price);
			System.out.println("颜色是 ：" + cars[i].color);
		}
	}
	
	//判断是否启动所需要的的汽车
	private static void startup(Car[] cars) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入需要启动汽车的品牌： ");
		String mark = scanner.next();
		for (int i = 0; i < cars.length; i++) {
			if (mark.equals(cars[i].brand)) {
				System.out.println("品牌是 ：" + cars[i].brand + "价格是 ：" + cars[i].price + "颜色是 ："
						+ cars[i].color + "的汽车已经启动！");
				return;
			} 
		}
		System.out.println("此车不存在，无法启动！");
	}
}
