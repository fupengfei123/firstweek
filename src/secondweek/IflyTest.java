package secondweek;

public class IflyTest {
	public static void main(String[] args) {
		Ifly ifly = new Bee();
		ifly.fly();
		ifly = new Pigeon();
		ifly.fly();
    	ifly = new Geese();
		ifly.fly();
		
		Bird1 bird1 = new Pigeon();
		bird1.egg();
		((Pigeon) bird1).eat();
		
		bird1 = new Geese();
		bird1.egg();
		
		Pigeon pigeon = new Pigeon();
		printFlyInfo(pigeon);
	}
	
	public static void printFlyInfo(Ifly ifly) {
		System.out.println("feixingdexinxi");
		ifly.fly();
	}
	
	public static void printFlyInfo(Pigeon pigeon) {
		System.out.println("feixingdexinxi");
		pigeon.fly();
	}
}
