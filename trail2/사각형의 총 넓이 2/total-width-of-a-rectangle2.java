import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[201][201];


        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for(int j = x1+100; j < x2+100; j++){
                for(int k = y1+100; k < y2+100; k++){
                    arr[k][j]++;
                }
            }
        }
        int cnt = 0;

        for (int i = 0; i < 200; i++){
            for (int j = 0; j < 200; j++){
                if(arr[i][j] > 0) {
                    cnt+=1;
                }
            }
        }

        System.out.print(cnt);

        // Please write your code here.
    }
}