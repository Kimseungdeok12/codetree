import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.print(def(n, 0));
    }

    public static int def(int a, int cnt){
        if(a == 0){
            return cnt;
        }

        cnt += (a % 10) * (a % 10);

        return def(a/10, cnt);
    } 
}