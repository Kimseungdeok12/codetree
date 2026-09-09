import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;

        for (int i = a; i <= 10; i++) {
            a *= i;
            
            if (a >= n) {
                System.out.println(i);
                break;
            }
        }
    }
}
