package firstweek;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog("小黑", "黑色",4);
		dog.move();
		dog.snapper();
		System.out.println("---------------");
		Fish fish = new Fish("小粉", "粉色");
		fish.move();
		fish.pop();
	}
}
