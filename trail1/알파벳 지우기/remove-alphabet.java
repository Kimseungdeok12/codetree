import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int n1 = 0;
        int n2 = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if ('0' <= c && c <= '9') {
                n1 = n1 * 10 + (c - '0');
            }
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);

            if ('0' <= c && c <= '9') {
                n2 = n2 * 10 + (c - '0');
            }
        }

        System.out.println(n1 + n2);
    }
}