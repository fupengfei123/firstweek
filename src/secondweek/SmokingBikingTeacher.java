package secondweek;

public class SmokingBikingTeacher extends Teacher implements ISmoking ,IBiking{

	public SmokingBikingTeacher(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bike() {
		System.out.println("我是老师，我会骑车！");
	}

	@Override
	public void smoke() {
		System.out.println("我是老师，我会抽烟！");
	}

}
