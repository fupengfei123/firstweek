package firstweek;

public class Dog extends Animal{
	private int legCount;
	
	public Dog() {

	}

	public Dog(int legCount) {
		super();
		this.legCount = legCount;
	}

	public int getLegCount() {
		return legCount;
	}

	public void setLegCount(int legCount) {
		this.legCount = legCount;
	}

	public Dog(String name,String color) {
		super(name,color);
	}
	
	public void snapper(String name,String color,int legCount) {
		System.out.println(color + "的" + legCount + "条腿的" + name + "正在咬人！" );
	}
}
