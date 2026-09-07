import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.print(a / b + ".");

        long remain = a % b;
        int cnt = 0;

        while (cnt < 20) {
            remain *= 10;

            System.out.print(remain / b);

            remain %= b;
            cnt++;
        }
    }
}