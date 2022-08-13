import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int output = length;
        int[][] array = new int[length][length];
        int SW = 1;
        int i = 0, j = -1;
        int k = 0;

        while(true){
            for(int c = 0 ; c < length ; c++){
                j = j+SW;
                array[i][j] = k;
                k = k + 1;
            }

            length = length - 1;

            if(length == 0) {
                break;
            }

            for(int c = 0 ; c < length ; c++){
                i = i+SW;
                array[i][j] = k;
                k = k + 1;
            }

            SW = SW * (-1);
        }

        for(i = 0 ; i < output ; i++){
            for(j = 0 ; j < output ; j++){
                System.out.printf("%2d ", array[i][j]);
            }

            System.out.println();
        }
    }
}
