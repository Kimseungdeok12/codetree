import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i+=2) {
            int[] t = Arrays.copyOfRange(arr,0,i);
            System.out.print(def(t, i) + " ");
        }
        
        // Please write your code here.
    }

    public static int def(int[] a, int num){
        Arrays.sort(a);

        return a[num/2];
    }
}