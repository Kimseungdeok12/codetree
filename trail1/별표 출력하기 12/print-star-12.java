import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int r = n;

        if (n % 2 == 1 && n != 1) {
            r = n - 1;
        }

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || (j % 2 == 0 && i <= j)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}