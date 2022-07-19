import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m; i += 1){
            for (int j = 0; j < n; j += 1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
