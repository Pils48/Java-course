
public class Task_1 {

	/* Дано натуральное число n. Выведите все числа от 1 до n. */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursion(5);

	}

	public static void f(int n) {
		if (n == 1) {
			System.out.println(n + " ");
		}else {
        f(n-1);
        System.out.println(n + " ");
		}
	}
	 public static String recursion(int n) {
	        // Базовый случай
	        if (n == 1) {
	            return "1";
	        }
	        // Шаг рекурсии / рекурсивное условие
	        return recursion(n - 1) + " " + n;
	    }
}
