import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(def(n, 0));
    }

    public static int def(int a, int r){
        if(a == 1) {
            return r;
        }
        
        if(a % 2 == 0) {
            return def(a/2, r+1);
        } else{
            return def(a*3 + 1, r+1);
        }
    }
}
