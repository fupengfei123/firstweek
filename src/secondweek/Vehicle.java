package secondweek;
/**
 * 
 * @author 鹏飞
 *
 */
public class Vehicle {
	private double speed;
	private double size;

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void move() {
		System.out.println("体积为： " + getSize() + "的交通工具正以： " + speed
				+ "的速度移动！");
	}
	
	public double speedUp() {
		speed -= 60;
		return speed;
	}
	
	public double speedDown() {
		speed -= 20;
		return speed;
	}
}
