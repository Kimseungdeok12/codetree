import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                int a = cnt;
                for (int j = a; j < a + n; j++) {
                    System.out.print(j + " ");
                }
                cnt += n-1;
            } else {
                cnt += n;
                int a = cnt;
                for (int j = a; j > a-n; j--) {
                    System.out.print(j + " ");
                }
                cnt++;
            }
            System.out.println();
        }
    }
}