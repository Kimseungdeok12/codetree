import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int n = 100;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            if (a == -999 || a == 999) {
                break;
            }

            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }

        System.out.println(max + " " + min);
    }
}

