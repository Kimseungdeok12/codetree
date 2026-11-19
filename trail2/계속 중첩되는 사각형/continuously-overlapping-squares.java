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

            if(i%2 == 0) {
                for(int j = x1+100; j < x2+100; j++){
                    for(int k = y1+100; k < y2+100; k++){
                        arr[k][j] = 1;
                    }
                }
            } else{
                for(int j = x1+100; j < x2+100; j++){
                    for(int k = y1+100; k < y2+100; k++){
                        arr[k][j] = 2;
                    }
                }
            }
        }

        int cnt = 0;

        for (int i = 0; i < 200; i++){
            for (int j = 0; j < 200; j++){
                if (arr[j][i] == 2){
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
        // Please write your code here.
    }
}