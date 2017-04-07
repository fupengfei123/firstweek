package secondweek;

public class Word extends Office{

	public Word() {
		super();
	}

	public Word(String data) {
		super(data);
	}

	@Override
	public void start() {
		super.start();
		System.out.println("Word正在打开的是： " + getData());
	}
	
	
}
