import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        int a;

        while (cnt < 10) {
            a = sc.nextInt();

            if (a == 0) {
                break;
            }

            sum += a;
            cnt++;
        }

        System.out.printf("%d %.1f", sum, (double) sum / cnt);
    }
}