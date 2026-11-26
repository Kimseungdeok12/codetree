import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dy = new int[]{0, -1,  0, 1};
        int[] dx = new int[]{1,  0, -1, 0};

        int[][] arr = new int[n][n];

        int cnt = 1;
        int x = n/2;
        int y = n/2;
        int st = 0;

        int turncnt = 0;
        int streetcnt = 1;

        arr[y][x] = 1;

        while(cnt <= n * n){
            turncnt++;

            for(int i = 0; i < streetcnt; i++){
                cnt++;
                if(cnt > n * n){
                    break;
                }
                x += dx[st];
                y += dy[st];

                arr[y][x] = cnt;

            }

            st = (st + 1) % 4;

            if(turncnt == 2){
                turncnt = 0;
                streetcnt++;
            }
        }     

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}