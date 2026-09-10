import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 11; j < 11 + n*2; j+=2) {
                System.out.print(j + 2*i + " ");
            }
            System.out.println();
        }
    }
}