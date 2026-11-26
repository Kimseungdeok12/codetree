import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dy = new int[]{1, 0, -1, 0};
        int[] dx = new int[]{0,  -1, 0, 1};

        char[][] arr = new char[n][n];

        int y = 0;
        int x = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();

        int st = (startNum -1) / n;
        if(st == 0){
            y = 0;
            x = (startNum - 1) % n;
        } else if(st == 1) {
            y = (startNum - 1) % n;
            x = n - 1;
        } else if(st == 2) {
            y = n - 1;
            x = (n - 1) - (startNum - 1) % n;
        } else if(st == 3) {
            y = (n - 1) - (startNum - 1) % n;
            x = 0;
        }

        // / \들어갈 때 구현
        while(x >= 0 && x < n && y >= 0 && y < n){
            if(arr[y][x] == '/'){
                if(st == 0) {
                    st = 1;
                    cnt++;

                } else if(st == 1){
                    st = 0;
                    cnt++;

                } else if(st == 2){
                    st = 3;
                    cnt++;

                } else if(st == 3){
                    st = 2;
                    cnt++;

                }
            } else {
                if(st == 0) {
                    st = 3;
                    cnt++;

                } else if(st == 1){
                    st = 2;
                    cnt++;

                } else if(st == 2){
                    st = 1;
                    cnt++;

                } else if(st == 3){
                    st = 0;
                    cnt++;

                }
            }

            x += dx[st];
            y += dy[st];
        }
        
        System.out.print(cnt);
    }
}