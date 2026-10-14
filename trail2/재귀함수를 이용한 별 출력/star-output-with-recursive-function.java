import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        def(1, n);
    }

    public static void def(int a, int b) {
        if(a > b) {
            return;
        }

        for(int i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        def(a+1, b);
    }
}