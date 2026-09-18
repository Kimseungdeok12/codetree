import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int m = sc.nextInt();

        int st = 1;

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = st;
                st++;
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}