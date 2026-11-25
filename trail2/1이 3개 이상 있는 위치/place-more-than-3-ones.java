import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = new int[]{ 1,  0, -1, 0};
        int[] dy = new int[]{ 0, -1,  0, 1};

        int[][] arr = new int[n][n];

        int cnt = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int c = 0;

                for (int k = 0; k < 4; k++){
                    int x = j - dx[k];
                    int y = i - dy[k];

                    if(x >= n || x < 0 || y >= n || y < 0) {
                        continue;
                    } else{
                        if(arr[y][x] == 1) {
                            c += 1;
                        }
                    }
                }

                if(c > 2){
                    cnt += 1;
                }
            }
        }

        System.out.print(cnt);
    }
}