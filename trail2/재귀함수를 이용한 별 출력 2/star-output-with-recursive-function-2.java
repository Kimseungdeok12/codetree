import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        def(n);
    }

    public static void def(int b) {
        if(b < 1) {
            return;
        }

        for (int i = 0; i < b; i++){
            System.out.print("* ");
        }
        System.out.println();
        def(b-1);
        for (int i = 0; i < b; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}