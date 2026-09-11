import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        int a;
        int c = 0;

        while (c < 10) {
            a = sc.nextInt();

            if (a == 0) {
                break;
            }

            if (a % 2 == 0) {
                sum += a;
                cnt++;
            }
            c ++;
        }

        System.out.printf("%d %d", cnt, sum);
    }
}