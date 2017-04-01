package firstweek;

public class Dog extends Animal{
	private int legCount;
	
	public Dog() {

	}

	public Dog(String name, String color,int legCount) {
		super(name,color);
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
	
	public void snapper() {
		System.out.println("新增的属性： " + legCount + "条腿的它正在咬人！" );
	}
}
