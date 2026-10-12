import java.util.Scanner;

public class Main {
    static int num = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        def(n, m);

        System.out.print(num);

    }

    static void def(int a, int b) {
        for(int i = Math.min(a,b); i > 0; i--){
            if(a % i == 0 && b % i == 0) {
                num = i;
                break;
            }
        }
    }
}