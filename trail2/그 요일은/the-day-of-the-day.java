import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String t = sc.next();

        int[] arr = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int d = 0;
        int cnt = 0;

        while (true) {
            if (day[d].equals(t)) {
                cnt++;
            }

            if (m1 == m2 && d1 == d2) {
                break;
            }

            d1++;

            if (d1 > arr[m1]) {
                m1++;
                d1 = 1;
            }

            d = (d + 1) % 7;
        }

        System.out.print(cnt);
    }
}