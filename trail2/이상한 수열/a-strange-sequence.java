import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(def(n));
    }

    public static int def(int n){
        if (n == 1){
            return 1;
        }

        if (n == 2){
            return 2;
        }

        return def(n - 1) + def(n / 3);
    }
}
