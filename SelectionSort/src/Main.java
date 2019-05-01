import java.util.*;

public class Main{

	public static void main(String[] args) {
		int[] arr = new int[] {2,1,7,1,34,5,65};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
public static void selectionSort(int[] arr){
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний, 
      2-последний,...)*/
    for (int i = 0; i < arr.length-1; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
        int min = arr[i];
        int min_i = i; 
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
        for (int j = i+1; j < arr.length; j++) {
            //Если находим, запоминаем его индекс
            if (arr[j] < min) {
                min = arr[j];
                min_i = j;
            }
        }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
        if (i != min_i) {
            int tmp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = tmp;
        }
     }
}
}