
public class Task_2 {
	/*
	 * Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от
	 * A до B включительно, в порядке возрастания, если A < B, или в порядке
	 * убывания в противном случае.
	 */
	public static void main(String[] args) {
		f(0, 10);
	}

	public static void f(int A, int B) {
		if (A < B) {
			if (A == B) {
				System.out.println(A);
			} else {
				f(A, B - 1);
				System.out.print(B + " ");
			}
		} else {
			System.out.print(A + " ");
			if (A != B) {
				f(A - 1, B);
			}

		}
	}

}
