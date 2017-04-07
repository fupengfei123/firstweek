package secondweek;

public class Geese extends Bird1 implements Ifly{

	@Override
	protected void egg() {
		System.out.println("大雁会下蛋！");
	}

	@Override
	public void fly() {
		System.out.println("大雁会飞！");
	}

}
