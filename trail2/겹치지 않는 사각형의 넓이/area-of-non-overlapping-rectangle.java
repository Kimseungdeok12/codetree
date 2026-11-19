import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2001][2001];


        for (int i = 0; i < 3; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            if(i < 2) {
                for(int j = x1+1000; j < x2+1000; j++){
                    for(int k = y1+1000; k < y2+1000; k++){
                        arr[k][j] = 1;
                    }
                }
            } else{
                for(int j = x1+1000; j < x2+1000; j++){
                    for(int k = y1+1000; k < y2+1000; k++){
                        arr[k][j] = 0;
                    }
                }
            }
        }
        int cnt = 0;

        for (int i = 0; i < 2000; i++){
            for (int j = 0; j < 2000; j++){
                if(arr[i][j] > 0) {
                    cnt+=1;
                }
            }
        }

        System.out.print(cnt);

        // Please write your code here.
    }
}