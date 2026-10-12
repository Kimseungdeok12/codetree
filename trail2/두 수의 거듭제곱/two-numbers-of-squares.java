import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(def(a ,b));
    }

    public static int def(int z, int x) {
        int q = 1;

        for(int i = 1; i <= x; i++) {
            q*=z;
        }

        return q;
    }
}