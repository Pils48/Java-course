
public class Task_5 {
	/*
	 * ���� ����������� ����� N. �������� ��� ��� ����� �� �����, � ������� �������,
	 * �������� �� ��������� ��� ������ ��������. ��� ������� ���� ������ ������
	 * ������������ ������, ������, ������� (�� � �����, ����������). ���������
	 * ������ �������� � ������������� ����������.
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
