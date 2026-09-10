import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n ; i++) {
            System.out.print("* ");
         } System.out.println();

         for(int i = 1; i <= n-2 ; i++) {
            for(int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= n-1-i ; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }

        if (n != 1) {
            for(int i = 1; i <= n ; i++) {
                System.out.print("* ");
            } System.out.println();
        }
    }
}
