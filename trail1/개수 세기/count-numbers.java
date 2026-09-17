import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[100];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[a]++;
        }

        System.out.print(arr[m]);
    }
}