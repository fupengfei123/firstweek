package secondweek;

public class Pigeon extends Bird1 implements Ifly{

	@Override
	protected void egg() {
		System.out.println("鸽子会下蛋！");
	}

	@Override
	public void fly() {
		System.out.println("鸽子会飞！");
	}
	
	public void eat() {
		System.out.println("鸽子会吃！");
	}

}
