
import java.util.*;

public class ÑountingSort {
	/*Actually this way of sorting is useful when we know that there is one the largest number 
	 * and none of other numbers is bigger then that one 
	 */

	public static void main(String[] args) {
		final int MAX_NUMBER = 10;
		int[] arr = new int[] {1,1,3,4,5,6,7,8,3,2};	
		int[] counters = new int[MAX_NUMBER];
		for (int i : arr) {
				counters[i]++;
				}
//		System.out.println(Arrays.toString(counters));
		int tmp = 0;
		for (int i = 0; i < counters.length; i++) {
			for (int j = 0; j < counters[i]; j++) {
				arr[tmp] = i;
				tmp++;
			}
		}
		System.out.println(Arrays.toString(arr));


	}

}
