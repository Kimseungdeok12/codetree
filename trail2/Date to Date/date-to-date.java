import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] arr = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int r = 1;

        if(m1 == m2) {
            r += d2 - d1;
        } else {
            r += arr[m1] - d1;
            r += d2;

            for(int i = m1 + 1; i < m2; i++) {
                r += arr[i];
            }
        }

        System.out.print(r);
    }
}