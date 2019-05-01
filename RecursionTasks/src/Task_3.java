
public class Task_3 {
	/* NON */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(akkermanFunction(3, 2));
	}

	public static int akkermanFunction(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if (m > 0 && n == 0) {
			return akkermanFunction(m - 1, 1);
		} else if (m > 0 && n > 0) {
			return akkermanFunction(m - 1, akkermanFunction(m, n - 1));
		}
		System.out.println();
		return 0;
	}

}
