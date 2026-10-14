import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.print(def(n, 1));
    }

    public static int def(int a ,int cnt){
        if (a == 0) {
            return cnt;
        }

        return def(a - 1, cnt * a);
    } 
}