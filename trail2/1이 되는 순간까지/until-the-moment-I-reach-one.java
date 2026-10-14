import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(def(n, 0));
    }

    public static int def(int a, int cnt){
        if(a == 1){
            return cnt;
        }

        if(a % 2 == 0) {
            return def(a/2, cnt+1);
        } else {
            return def(a/3, cnt+1);
        }
    } 
}