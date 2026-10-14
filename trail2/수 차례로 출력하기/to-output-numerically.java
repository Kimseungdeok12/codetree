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
            System.out.println();
            return;
        }

        System.out.print(a + " ");
        def(a+1, b);
        System.out.print(a + " ");
    }
}