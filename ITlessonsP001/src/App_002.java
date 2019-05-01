import java.util.Random;
/*Та же задача но пытаюсь отталкиваться от обратного*/
public class App_002 {
    public static void main(String[] args) {
        int[] arr  = new int[10];
        int ElemToDel = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        int QofDelElem = 0;
        for (int i = 0; i < 10 - QofDelElem; i++){
            int index = 0;
            for (int j = 0; j < 10; j++){
                if (arr[i] == arr[j]){
                    ElemToDel = arr[j];
                    QofDelElem++;
                  }
                }

            if (QofDelElem == 1){break;}
            /*Чтобы решалась надо делать i--
              этого я делать не буду, следует кодить
            * как App_001*/
            for (int k = 0; k < 10; k++){
                if (arr[k] != ElemToDel){
                    arr[index] = arr[k];
                    index++;
                }

            }
        }

        System.out.println();

        for (int i = 0; i < 10 - QofDelElem; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
