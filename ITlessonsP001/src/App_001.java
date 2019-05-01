import java.util.Random;

public class App_001 {
    /*В линейном массиве удалите элементы,
    которые встречаются более одного раза*/
    public static void main(String[] args) {
       int [] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            arr[i] = random.nextInt(5);
        }
        for (int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
        int index = 0;
        int [] tmp = new int[10];
        for (int i = 0; i < 10; i++){
            for (int j = index; j < 10; j++){
                if (arr[i] == arr[j] && i != j){
                    tmp[index] = arr[i];
                    index++;
                    break;
                }
            }
        }
        int j = 0;
        int tmpIndex = 0;
        for (int i = 0; i < 10 ; i++){
            for (j = 0; j < index; j++){
                if (arr[i] == tmp[j]){
                 break;
                }
            }
            if (arr[i] == tmp[j]){continue;}
            else{
                arr[tmpIndex] = arr[i];
                tmpIndex++;
            }
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < tmpIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

