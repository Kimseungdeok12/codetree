import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        String aStr = Integer.toString(a);

        int cnt = 0;

        for (int i = 0; i < aStr.length(); i++) {
            cnt += aStr.charAt(i) - '0';
        }

        System.out.println(cnt);
    }
}