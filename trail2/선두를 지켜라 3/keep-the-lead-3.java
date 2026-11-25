import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[1000001][2];
        int a = 0;
        int b = 0;
        int st = 3;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j++){
                a++;
                arr[a][0] = arr[a-1][0] + v;
            }
        }
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for (int j = 0; j < t; j++){
                b++;
                arr[b][1] = arr[b-1][1] + v;
            }
        }
        
        for (int i = 1; i <= Math.min(a, b) ; i++){
            int stus = 0;
            if(arr[i][0] > arr[i][1]){
                stus = 1;
            } else if(arr[i][0] < arr[i][1]) {
                stus = 2;
            } else{
                stus = 3;
            }

            if(st != stus){
                st = stus;
                cnt += 1;
            }
        }

        System.out.print(cnt);
    }
}