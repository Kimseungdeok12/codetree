import java.util.Scanner;
import java.util.Arrays;

public class Main {
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            System.out.println(def(a1, a2));
        }
    }

    public static int def(int a, int b){
        int[] ar = Arrays.copyOfRange(arr, a-1, b);

        int cnt = 0;

        for (int i = 0; i < ar.length; i++) {
            cnt+=ar[i];
        }

        return cnt;
    }
}