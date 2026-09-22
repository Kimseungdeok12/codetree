import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        while (a.length() > 1) {
            int n = sc.nextInt();

            if (n >= a.length()) {
                n = a.length() - 1;
            }

            a = a.substring(0, n) + a.substring(n + 1);

            System.out.println(a + " ");
        }
    }
}