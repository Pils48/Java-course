
public class Task_5 {
	/*
	 * Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке,
	 * разделяя их пробелами или новыми строками. При решении этой задачи нельзя
	 * использовать строки, списки, массивы (ну и циклы, разумеется). Разрешена
	 * только рекурсия и целочисленная арифметика.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(1234323);
	}

	public static void f(int n) {

		if (n < 10) {
			System.out.println(n);
		} else {
			f(n / 10);
			System.out.println(n % 10);
		}

	}

}
