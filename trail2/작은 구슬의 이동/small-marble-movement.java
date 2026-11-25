import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int y = sc.nextInt();
        int x = sc.nextInt();
        char D = sc.next().charAt(0);
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, -1, 0, 1};

        

        for(int i = 0; i < T; i++){
            if(D == 'L'){
                if(x == 1){
                    D = 'R';
                } else{
                    x -= 1;
                }   
            } else if(D == 'R'){
                if(x == n){
                    D = 'L';
                } else{
                    x += 1;
                }   
            } else if(D == 'U'){
                if(y == 1){
                    D = 'D';
                } else{
                    y -= 1;
                }   
            } else if(D == 'D'){
                if(y == n){
                    D = 'U';
                } else{
                    y += 1;
                }   
            }   
        }

        System.out.print(y + " " + x);
    }
}