import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);

            if ('a' <= a && a <= 'z') {
                System.out.print(a);
            }

            if ('A' <= a && a <= 'Z') {
                System.out.print((char)((int)a + 32));
            }

            if ('0' <= a && a <= '9') {
                System.out.print(a);
            }
        }
    }
}

