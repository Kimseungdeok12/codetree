import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();
 
        int[] arr = new int[100];

        int cnt = 0;
        int r = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
            if (arr[i] == 2) {
                cnt++;
            }

            if (cnt == 3) {
                r = i+1;
                break;
            }
            
        }

        System.out.print(r);
    }
}