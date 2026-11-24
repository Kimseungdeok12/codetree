import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        int r = -1;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();

            arr[a] += 1;

            if (r == -1 && arr[a] == k){
                r = a;
            }
        }

        System.out.print(r);
        // Please write your code here.
    }
}