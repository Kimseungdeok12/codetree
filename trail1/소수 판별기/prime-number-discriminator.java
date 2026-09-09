import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean st = true;
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                st = false;
                break;
            }
        }
        if (st) {
            System.out.println("P");
        }
        else {
            System.out.println("C");
        }
    }
}
