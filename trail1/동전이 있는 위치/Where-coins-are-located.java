import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < m; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a-1][b-1] = 1;
        }

        for(int x = 0; x < n; x++){
            for(int y = 0; y < n; y++){

                System.out.print(arr[x][y] + " ");

            }

            System.out.println();
        }
    }
}