package secondweek;

public class Bee extends Insect implements Ifly{

	@Override
	public void fly() {
		System.out.println("密蜂会飞！");
	}

	@Override
	public void spawn() {
		System.out.println("密蜂会产卵！");
	}

}
