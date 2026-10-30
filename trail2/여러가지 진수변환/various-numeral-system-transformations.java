import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        long r = 0;
        int c = 1;
        while (c < n) {
            c *= b;
        }

        while(c > 0){
            r *= 10;

            if(n >= c){
                r += n / c;
                n = n % c;
            }

            c /= b;
        }

        System.out.print(r);
    }
}