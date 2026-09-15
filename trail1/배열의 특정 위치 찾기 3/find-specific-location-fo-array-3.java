import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            arr[count] = n;
            count++;
        }

        int sum = arr[count - 1]
                + arr[count - 2]
                + arr[count - 3];

        System.out.print(sum);
    }
}