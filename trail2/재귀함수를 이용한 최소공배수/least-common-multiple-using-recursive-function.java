import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        System.out.print(def(n, arr, arr[0], 1));
    }

    public static int def(int n, int[] arr, int r, int cnt){
        if (n == cnt){
            return r;
        }

        int re = 1;

        while((r * re) % arr[cnt] != 0){
            re++;
        }

        return def(n, arr, r * re, cnt+1);
    }
}