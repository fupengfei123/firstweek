package secondweek;

public class SmokingTeacher extends Teacher implements ISmoking{

	public SmokingTeacher(String name, int age) {
		super(name, age);
	}

	@Override
	public void smoke() {
		System.out.println("我是抽烟的老师！");
	}

}
