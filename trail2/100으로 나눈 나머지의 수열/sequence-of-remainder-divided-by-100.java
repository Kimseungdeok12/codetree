import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(def(2, 4, n, 2));
    }

    public static int def(int a, int b, int n, int cnt){
        if(n == 1) {
            return a;
        }

        if(n == cnt) {
            return b;
        }
        
        return def(b, (a*b) % 100 , n, cnt+1);
    }
}
