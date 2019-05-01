import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 23, 43, 65,121 ,7};
		sort(arr, 0, arr.length);
	}

	public static int[] sort(int[] array, int from, int len) {
		if (len == 0) {
			return new int[0];
		} else if (len == 1) {
			return new int[] { array[from] };
		} else if (len == 2) {
			if (array[from] < array[from + 1]) {
				return new int[] { array[from], array[from + 1] };
			} else {
				return new int[] { array[from + 1], array[from] };
			}
		} else {
			int[] left = sort(array, from, len / 2);
			int[] right = sort(array, from + (len / 2), len - (len / 2));

			return merge(left, right);
		}

	}

	private static int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int pointerA = 0;
		int pointerB = 0;
		int tmp = 0;
		for (int i = 0; i < result.length; i++) {
			if (pointerA < a.length && pointerB < b.length) {
				if (a[pointerA] > b[pointerB]) {
					result[i] = b[pointerB];
					pointerB++;
					tmp++;
				} else {
					result[i] = a[pointerA];
					pointerA++;
					tmp++;
				}
			} else if (pointerA == a.length || pointerB == b.length) {
                   break;
			}
		}
		if (pointerA == a.length) {
			for (int j = tmp; j < result.length; j++) {
				result[j] = b[pointerB];
				pointerB++;
			}
		}else if (pointerB == b.length) {
			for (int j = tmp; j < result.length; j++) {
				result[j] = a[pointerA];
				pointerA++;
			}
		}

		System.out.println(Arrays.toString(a) + "+" + Arrays.toString(b));
		System.out.println("-->" + Arrays.toString(result));
		return result;

	}

}
