package secondweek;

public class CalTest {
	
	public static void main(String[] args) {
		
		//加法
//		Cal cal = new Add(55, 9);
//		System.out.println(cal.getResult());
		System.out.println(Cal.add(11,22));
		
		//减法
//		cal = new Sub(66,5);
//		System.out.println(cal.getResult());
		System.out.println(Cal.sub(25, 5));
		
		//乘法
//		cal = new Multi(25,25);
//		System.out.println(cal.getResult());
		System.out.println(Cal.multi(50, 5));
		
		//除法
//		cal = new Div(99,3);
//		System.out.println(cal.getResult());
		System.out.println(Cal.div(100, 20));
	}
}
