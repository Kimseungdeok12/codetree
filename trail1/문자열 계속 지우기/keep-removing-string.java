import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        while (a.length() > 1) {
            int st = 0;

            for (int i = 0; i <= a.length() - b.length(); i++) {
                String z = a.substring(i, i + b.length());

                if (z.equals(b)) {
                    a = a.substring(0, i) + a.substring(i + b.length());
                    st = 1;
                    break;
                }
            }

            if (st == 0) {
                break;
            }
        }

        System.out.println(a);
    }
}