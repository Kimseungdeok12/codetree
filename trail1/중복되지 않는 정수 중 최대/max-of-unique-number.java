import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int max = -1;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            int cnt = 1;
            for(int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    cnt++;
                    break;
                }
            }

            if (cnt == 1) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }

        System.out.print(max);
    }
}