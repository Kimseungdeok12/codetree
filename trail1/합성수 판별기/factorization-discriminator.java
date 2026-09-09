 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean st = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                st = false;
                break;
            }
        }

        if (st) {
            System.out.print("N");
        } else {
            System.out.print("C");
        }

    }
}
