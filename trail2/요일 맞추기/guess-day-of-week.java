import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        int d = 1;

        if (m1 == m2) {
            if (d1 <= d2) {
                d = (d + d2 - d1) % 7;
            } else {
                for (int i = d1; i > d2; i--) {
                    d = (d + 6) % 7;
                }
            }
        } else if (m1 > m2) {
            while (m1 != m2 || d1 != d2) {
                if (d2 == arr[m2]) {
                    m2++;
                    d2 = 1;
                } else {
                    d2++;
                }

                d = (d + 6) % 7;
            }
        } else {
            while (m1 != m2 || d1 != d2) {
                if (d2 == 1) {
                    m2--;
                    d2 = arr[m2];
                } else {
                    d2--;
                }

                d = (d + 1) % 7;
            }
        }

        System.out.print(day[d]);
    }
}