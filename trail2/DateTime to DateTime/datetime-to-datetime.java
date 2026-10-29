import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int r = (A - 11) * 1440 + (B - 11) * 60 + (C - 11);

        if (r < 0) {
            System.out.print(-1);
        } else {
            System.out.print(r);
        }
    }
}