import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 100; i++) {
            int a = sc.nextInt();

            if (a == 0) {
                break;
            }
            int p = a / 10;
            arr[p]++;
        }
        // 개수 출력
        for (int i = 1; i <= 9 ; i++) {
            System.out.println(i + " - " + arr[i]);
        }
    }
}
