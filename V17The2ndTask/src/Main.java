import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [][] array = new int[10][20];
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20;j++){
                array[i][j] = rand.nextInt(90)+10;
            }
        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


        for (int j = 0; j < 20; j++) {
            int max = array[0][j];
            int imax = 0;
            int min = array[0][j];
            int imin = 0;
            for (int i = 0; i < 10; i++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    imax = i;
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                    imin = i;
                }
            }
            if (imin == 0){
                int tmp = array[0][j];
                array[0][j] = max;
                array[imax][j] = tmp;
                imin = imax;
                tmp = array[9][j];
                array[9][j] = min;
                array[imin][j] = tmp;

            }else {
                int tmp = array[0][j];
                array[0][j] = max;
                array[imax][j] = tmp;
                tmp = array[9][j];
                array[9][j] = min;
                array[imin][j] = tmp;
            }
        }


        System.out.println();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
