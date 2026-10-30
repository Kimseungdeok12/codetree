import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        long r = 0;
        int c = 1;
        while (c < n) {
            c *= 2;
        }

        while(c > 0){
            r *= 10;

            if(n >= c){
                n -= c;
                r += 1;
            }

            c /= 2;
        }

        System.out.print(r);
    }
}