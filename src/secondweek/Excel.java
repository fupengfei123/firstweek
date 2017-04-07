package secondweek;

public class Excel extends Office{

	public Excel() {
		super();
	}

	public Excel(String data) {
		super(data);
	}
	
	public void start() {
		System.out.println("Excel正在打开的是： " + getData());
	}
}
