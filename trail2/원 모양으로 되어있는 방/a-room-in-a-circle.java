import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int cnt = Integer.MAX_VALUE;

        for (int st = 0; st < n; st++){
            int c = 0;
            for (int i = 1; i <= n-1; i++){
                int z = (st + i) % n;
                c += arr[z] * i; 
            }

            cnt = Math.min(cnt, c);
        }

        System.out.print(cnt);
    }
}