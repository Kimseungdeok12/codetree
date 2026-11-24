import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[2][1000001];

        int stA = 0;
        int stB = 0;

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j++){
                stA += 1;
                arr[0][stA] = arr[0][stA-1] + v;
            }
        }

        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j++){
                stB += 1;
                arr[1][stB] = arr[1][stB-1] + v;
            }
        }

        int status = 0;
        
        for (int i = 1; i <= Math.min(stA, stB); i++) {
            if (arr[0][i] > arr[1][i]) {
                if (status == 2) {
                    cnt++;
                }
                status = 1;
            } else if (arr[0][i] < arr[1][i]) {
                if (status == 1) {
                    cnt++;
                }
                status = 2;
            }
        }

        System.out.print(cnt);
    }
}