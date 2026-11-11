import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                arr[j] += 1;
            }
        }

        int mnum = 0;

        for (int i = 0; i < 101; i++) {
            mnum = Math.max(arr[i], mnum);
        }

        System.out.print(mnum);

    }
}