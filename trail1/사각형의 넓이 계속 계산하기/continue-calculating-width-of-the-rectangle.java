 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();

            System.out.println(a*b);

            if (s.equals("C")) {
                break;
            }
        }
    }
}
