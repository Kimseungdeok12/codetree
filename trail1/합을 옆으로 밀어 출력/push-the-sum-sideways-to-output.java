import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            cnt += sc.nextInt();
        }

        String a = Integer.toString(cnt);

        for (int i = 1; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }

        System.out.print(a.charAt(0));
    }
}