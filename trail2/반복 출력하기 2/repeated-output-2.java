import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        def(n);
    }

    public static void def(int a){
        if (a == 0) {
            return;
        }

        System.out.println("HelloWorld");

        def(a-1);
    }
}