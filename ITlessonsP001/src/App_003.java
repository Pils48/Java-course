import java.util.Random;

public class App_003 {

    public static boolean isPrime(int num){
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            arr[i] = random.nextInt(13);
        }
        for (int i = 0; i < 20; i++){
            System.out.print(arr[i] + " ");
        }
        int index = 0;
        for (int i = 0; i < 20; i++){
           if (!isPrime(arr[i])){
              arr[index] = arr[i];
              index++;
           }
        }

        System.out.println();

        for (int i = 0; i < index; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
