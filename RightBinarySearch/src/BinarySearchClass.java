
public class BinarySearchClass {

	public static void main(String[] args) {
	
		int[] array = new int[] {1,2,5,5,6,8,10,14,17};
		int x = 17;
		iterationSearch(array,x);
	}
	
	public static void iterationSearch(int[] array, int SearchingStuff) {
		int left = 0;
		int right = array.length-1;
		while (right - left > 1) {
			int mid = (left + right)/2;
			if ((SearchingStuff >= array[mid])||(SearchingStuff > array[mid] && SearchingStuff < array[mid])) {
				/*Always if we have a choice we have to choose right 
				 * interval, so that our program calls right ...Search
				 */
				left = mid;	
			}else if(SearchingStuff < array[mid]) {
				right = mid;
			}else if (SearchingStuff == array[mid]) {
				System.out.println("found " + array[mid]);
				break;
			}
			
			}
		
		if (array[right] == SearchingStuff) {
			System.out.println("found " + array[right]);
		}else if (array[left] == SearchingStuff) {
			System.out.println("found " + array[left]);
		}/*else if (!(array[right] == SearchingStuff) && !(array[left] == SearchingStuff)) {
			*System.out.println("Not Found");
			*
		}	**/
		
			
		
	}

	public static void recursionSearch(int[] array, int x) {
		int left = 0;
		int right = array.length - 1;
		int mid = (left + right)/2;
		if (x > array[mid]) {
			recursionSearch();
		}
	}
	
}
