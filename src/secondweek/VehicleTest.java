package secondweek;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setSpeed(90);
		vehicle.setSize(700);
		vehicle.move();
		
		System.out.println("交通工具正以" + vehicle.speedUp() + "的速度加速！");
		System.out.println("交通工具正以" + vehicle.speedDown() + "的速度减速！");
		
	}
}
