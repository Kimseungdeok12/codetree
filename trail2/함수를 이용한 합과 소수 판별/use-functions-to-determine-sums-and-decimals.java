import java.util.Scanner;
public class Main {
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        def(a, b);
        
        System.out.print(cnt);
    }

    public static void def(int q, int w) {
        for(int i = q; i <= w; i++) {
            int s = 0;
            for(int j = 2; j < i; j++){
                if(i % j == 0) {
                    s = 1;
                    break;
                }
            }

            if (s == 1) {
                continue;
            }

            if(((i % 10) + (i / 10)) % 2 != 0) {
                continue;
            }

            cnt++;
        }
    }
}