import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum0 = 0;
        int sum1 = 0;

        for (int i = 0; i < 10; i+=2) {
            sum0 += arr[i];
        }

        for (int i = 1; i < 10; i+=2) {
            sum1 += arr[i];
        }

        if (sum0 > sum1) {
            System.out.print(sum0 - sum1);
        } else {
            System.out.print(sum1 - sum0);
        }
    }
}
