
public class Task_1 {

	/* ���� ����������� ����� n. �������� ��� ����� �� 1 �� n. */

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
	        // ������� ������
	        if (n == 1) {
	            return "1";
	        }
	        // ��� �������� / ����������� �������
	        return recursion(n - 1) + " " + n;
	    }
}
