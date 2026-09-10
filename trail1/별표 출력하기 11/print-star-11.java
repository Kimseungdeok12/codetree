import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n*2 +1 ; i++) {
            if (i % 2 == 1) {
                for(int j = 1; j <= n +1; j++) {
                    System.out.print("*   ");
                }
                System.out.println();
            } else {
                for(int j = 1; j <= n*2 +1 ; j++) {
                    System.out.print("* ");
                }
                System.out.println(); 
            }
        }
    }
}