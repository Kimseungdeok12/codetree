import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int q = sc.nextInt();

            if (q == 1) {
                a = a.substring(1)+a.substring(0,1);
            } else if (q == 2) {
                a = a.substring(a.length()-1)+a.substring(0,a.length()-1);
            } else {
                a = new StringBuilder(a).reverse().toString();
            }
            System.out.println(a);
        }
    }
}