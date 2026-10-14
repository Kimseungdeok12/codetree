import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        if (n <= 2) {
            System.out.print(1);
        } else {
            System.out.print(pn(n, 1, 1, 2));
        }
    }

    public static int pn(int n, int a1, int a2, int hh){
        if(n == hh) {
            return a2;
        }

        int m = a1 + a2;

        return pn(n, a2, m, hh+1);
    }
}