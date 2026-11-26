import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] dy = new int[]{1, 0, -1, 0};
        int[] dx = new int[]{0, 1, 0, -1};

        int[][] arr = new int[n][m];

        int cnt = 1;
        int x = 0;
        int y = 0;
        int st = 0;

        arr[0][0] = 1;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                cnt++;
                if(cnt > n * m){
                    continue;
                }
                if(x + dx[st] < 0 || x + dx[st] >= m || y + dy[st] < 0 || y + dy[st] >= n || arr[y + dy[st]][x + dx[st]] != 0){
                    st = (st + 1) % 4;
                } 

                x += dx[st];
                y += dy[st];

                arr[y][x] = cnt;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}