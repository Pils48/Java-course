
public class Task_2 {
	/*
	 * ���� ��� ����� ����� A � � (������ � ��������� ������). �������� ��� ����� ��
	 * A �� B ������������, � ������� �����������, ���� A < B, ��� � �������
	 * �������� � ��������� ������.
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
