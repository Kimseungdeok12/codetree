import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dx = new int[]{ 1,  0, -1, 0};
        int[] dy = new int[]{ 0, -1,  0, 1};

        int[][] arr = new int[n][n];

        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            arr[a][b] = 1;

            int c = 0;

            for (int k = 0; k < 4; k++){
                int x = b - dx[k];
                int y = a - dy[k];

                if(x >= n || x < 0 || y >= n || y < 0) {
                        continue;
                } else{
                    if(arr[y][x] == 1) {
                        c += 1;
                    }
                }
            }

            if(c == 3){
                System.out.println(1);
            } else{
                System.out.println(0);
            }
 
        }
    }
}