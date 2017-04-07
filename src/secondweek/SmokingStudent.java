package secondweek;

public class SmokingStudent extends Student implements ISmoking{

	@Override
	public void smoke() {
		System.out.println("我是抽烟的学生！");
	}

	@Override
	public void showInfo() {
		System.out.println("我是继承AbstractPerson类的showInfo()方法！");
	}

}
