import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[]{1,  0, -1, 0};
        int[] dy = new int[]{0, -1,  0, 1};
        int nx = 0;
        int ny = 0;

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            
            if(direction == 'N'){
                nx += distance * dx[3];
                ny += distance * dy[3];
            } else if(direction == 'E'){
                nx += distance * dx[0];
                ny += distance * dy[0];
            } else if(direction == 'S'){
                nx += distance * dx[1];
                ny += distance * dy[1];
            } else if(direction == 'W'){
                nx += distance * dx[2];
                ny += distance * dy[2];
            }
        }

        System.out.print(nx + " " + ny);
    }
}