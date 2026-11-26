import java.util.Scanner;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int r = Integer.MAX_VALUE;

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
           
        }

        for (int i = 1; i < n-1; i++){
            int sx = arr[0][0];
            int sy = arr[0][1];
            int cnt = 0;

            for (int j = 1; j < n; j++){
                if(i == j){
                    continue;
                } else{
                    cnt += Math.abs(sx - arr[j][0]) + Math.abs(sy - arr[j][1]);
                    sx = arr[j][0];
                    sy = arr[j][1];
                }
            }

            r = Math.min(cnt, r);
        }

        System.out.print(r);
    }
}