import java.util.*;

public class Main{

	public static void main(String[] args) {
		int[] arr = new int[] {2,1,7,1,34,5,65};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
public static void selectionSort(int[] arr){
    /*�� ������� ����� ������������� ��� ������������
      ��������� ������� (0 - ���������, 1-���������, 
      2-���������,...)*/
    for (int i = 0; i < arr.length-1; i++) {
        /*������������, ��� ������ ������� (� ������
           ������������ ���������) �������� ����������� */
        int min = arr[i];
        int min_i = i; 
        /*� ���������� ����� ������������ ���� �������,
           ������� ������ ��������������� ��������*/
        for (int j = i+1; j < arr.length; j++) {
            //���� �������, ���������� ��� ������
            if (arr[j] < min) {
                min = arr[j];
                min_i = j;
            }
        }
        /*���� ������� �������, �������, ��� �� ������� �������,
          ������ �� �������*/
        if (i != min_i) {
            int tmp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = tmp;
        }
     }
}
}