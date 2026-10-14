import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        System.out.print(def(a*b*c,0));
    }

    public static int def(int num, int r){
        if(num <= 0){
            return r;
        }

        return def(num/10, r + num%10);
    }
}