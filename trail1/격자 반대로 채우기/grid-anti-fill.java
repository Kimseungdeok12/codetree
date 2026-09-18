import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int cnt = n*n;

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if(i % 2 == 0) {
                    for (int j = n-1; j >= 0; j--) {
                        arr[j][i] = cnt;
                        cnt--;
                    }
                }

                else{
                    for (int j = 0; j < n; j++) {
                        arr[j][i] = cnt;
                        cnt--;
                    }
                }
            }
        }

        else{
            for (int i = 0; i < n; i++) {
                if(i % 2 == 1) {
                    for (int j = n-1; j >= 0; j--) {
                        arr[j][i] = cnt;
                        cnt--;
                    }
                }

                else{
                    for (int j = 0; j < n; j++) {
                        arr[j][i] = cnt;
                        cnt--;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}