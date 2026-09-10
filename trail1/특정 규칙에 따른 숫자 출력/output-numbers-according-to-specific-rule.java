import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n+1-i; j >= 1; j--) {
                System.out.print(cnt + " ");
                cnt = (cnt%9)+1;
            }
            System.out.println();
        } 
    }
}