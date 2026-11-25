import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dx = new int[]{1,  0, -1, 0};
        int[] dy = new int[]{0, -1,  0, 1};
        int nx = 0;
        int ny = 0;
        int st = 3;
        String a = sc.next();

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
                nx += dx[st];
                ny += dy[st];
            }
            
        }

        System.out.print(nx + " " + ny);
    }
}