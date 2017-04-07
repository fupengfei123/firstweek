 package secondweek;

public class OfficeTest {
	public static void main(String[] args) {
		Office office = new Word("word");
		office.start();
		office = new Ppt("ppt");
		office.start();
		office = new Excel("excel");
		office.start();
	}
}
