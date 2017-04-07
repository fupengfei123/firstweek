package secondweek;

public class ArrayUtilTest {
	public static void main(String[] args) {
		int[] array = { 0, 4, 2, 6, 8, 3, 9, 7 };
		ArrayUtil.bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
