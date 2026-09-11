import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 65;

        for(int i = 0; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for(int j = 1; j <= n - i; j++) {
                System.out.print((char)cnt + " ");
                if (cnt > 89) {
                    cnt = 65;
                } else {
                    cnt++;
                }
            }
            System.out.println();
        }
    }
}
