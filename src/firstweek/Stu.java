package firstweek;

public class Stu extends Person{
	private String classroom;
	
	public Stu() {
		
	}
	
	public Stu(String name, int age, String gender,String classroom) {
		super(name, age, gender);
		this.classroom = classroom;
	}
	
	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	
	

	public void study() {
		eatFood();
		System.out.println("现在在" + classroom + "学习！");
	}
}
