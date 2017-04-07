package secondweek;

public class Ppt extends Office{

	public Ppt() {
		super();
	}

	public Ppt(String data) {
		super(data);
	}
	
	public void start() {
		System.out.println("Ppt正在打开的是： " + getData());
	}
}
