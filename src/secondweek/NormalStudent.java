package secondweek;

public class NormalStudent extends Student {

	@Override
	public void study() {
		System.out.println(className + "的" + name + "正在学习！");
	}

	@Override
	public void showInfo() {
		System.out.println("我是继承AbstractPerson类的showInfo()方法！");
	}
}
