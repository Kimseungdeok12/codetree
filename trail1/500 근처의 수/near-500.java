import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = 1000;
        int max500 = 0;

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();

            if (a < 500 && max500 < a) {
                max500 = a;
            }

            if (a > 500 && a < min) {
                min = a;
            }
        }

        System.out.println(max500 + " " + min);
    }
}

