package firstweek;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog("小黑", "黑色");
		dog.move();
		dog.snapper("小黄", "黄色",4);
		System.out.println("---------------");
		Fish fish = new Fish("小粉", "粉色");
		fish.move();
		fish.pop("小红", "红色");
	}
}
