import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        def(n, arr, sc);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void def(int a, int[] arr, Scanner sc) {
        for(int i = 0; i < a; i++) {
            int z = sc.nextInt();

            if(z % 2 == 0) {
                arr[i] = z / 2;
            } else {
                arr[i] = z;
            }
        }
    }
}