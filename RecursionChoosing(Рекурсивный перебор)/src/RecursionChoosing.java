import java.util.Arrays;

public class RecursionChoosing {
	
	private static int[]array = new int[5];

	public static void main(String[] args) {
		choosing(array.length - 1);

	}
	
	public static void choosing(int index) {
		if(index == -1) {
			System.out.println(Arrays.toString(array));
		}else{
			array[index] = 0;
			choosing(index-1);
			array[index] = 1;
			choosing(index - 1);
		}
	}

}
