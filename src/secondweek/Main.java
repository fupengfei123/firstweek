package secondweek;

public class Main {
	public static void main(String[] args) {
		AbstractPerson person = new Teacher("zhangsan",22);
		person.showInfo();
		
		IBiking iBiking = new SmokingBikingTeacher("zhangsan",22);
		iBiking.bike();
		iBiking.smoke();
		
		ISmoking iSmoking = new SmokingStudent();
		iSmoking.smoke();
		iSmoking = new SmokingTeacher("zhangsan",22);
		iSmoking.smoke();
		
		Teacher teacher = new SmokingTeacher("zhangsan",22);
		teacher.showInfo();
		teacher.teach();
		
		Student student = new SmokingStudent();
		student.showInfo();
		student.study();
	}
}
