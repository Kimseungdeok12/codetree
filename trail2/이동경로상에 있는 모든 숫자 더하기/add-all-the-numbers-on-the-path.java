import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String a = sc.next();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] dy = new int[]{-1, 0,  1, 0};
        int[] dx = new int[]{0,  1, 0, -1};
        int nx = n/2;
        int ny = n/2;
        int st = 0;
        int r = arr[n/2][n/2];

        for (int i = 0; i < a.length(); i++) {

            char z = a.charAt(i);
            
            if(z == 'L'){
                if (st == 0){
                    st = 3;
                } else {
                    st = (st - 1) % 4;
                }
            } else if(z == 'R'){
                st = (st + 1) % 4;
            } else{
                int nnx = nx + dx[st];
                int nny = ny + dy[st];
                if(nnx < 0 || nnx >= n || nny < 0 || nny >= n){
                    continue;
                } else{
                    nx = nnx;
                    ny = nny;
                    r += arr[ny][nx];
                }
            }
            
        }

        System.out.print(r);
    }
}