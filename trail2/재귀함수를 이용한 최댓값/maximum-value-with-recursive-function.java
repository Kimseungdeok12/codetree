import java.io.BufferedReader;
import java.util.Scanner;
public class Main {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.print(def(n-1, 0));
    }

    public static int def(int a, int r){
        if (a < 0) {
            return r;
        }

        if(r < arr[a]) {
            return def(a -1, arr[a]);
        } else {
            return def(a - 1, r);
        }
    }
}