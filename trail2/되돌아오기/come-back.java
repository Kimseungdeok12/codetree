import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dy = new int[]{0, -1,  0, 1};
        int[] dx = new int[]{1,  0, -1, 0};
        int nx = 0;
        int ny = 0;
        int time = 0;
        int r = -1;

        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            
            if(direction == 'N'){
                for(int j = 0; j < distance; j++){
                    nx += dx[3];
                    ny += dy[3];
                    time++;

                    if(nx == 0 && ny == 0){
                        r = time;
                    }
                }
            } else if(direction == 'E'){
                for(int j = 0; j < distance; j++){
                    nx += dx[0];
                    ny += dy[0];
                    time++;

                    if(nx == 0 && ny == 0){
                        r = time;
                    }
                }
            } else if(direction == 'S'){
                for(int j = 0; j < distance; j++){
                    nx += dx[1];
                    ny += dy[1];
                    time++;

                    if(nx == 0 && ny == 0){
                        r = time;
                    }
                }
            } else if(direction == 'W'){
                for(int j = 0; j < distance; j++){
                    nx += dx[2];
                    ny += dy[2];
                    time++;

                    if(nx == 0 && ny == 0){
                        r = time;
                    }
                }
            }

            if(r != -1){
                break;
            }
        }

        System.out.print(r);
    }
}