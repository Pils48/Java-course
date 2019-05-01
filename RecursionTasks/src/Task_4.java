
public class Task_4 {
	/*
	 * Дано натуральное число N. Вычислите сумму его цифр. При решении этой задачи
	 * нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(32223);
	}

	private static int sum = 0;

	public static void f(int n) {

		if (n < 10) {
			System.out.println(sum + n);
		} else {
			sum += (n % 10);
			f(n / 10);
		}
		
	}
}
