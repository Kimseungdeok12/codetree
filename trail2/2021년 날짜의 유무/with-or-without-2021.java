import java.util.Scanner;
public class Main {
    public static int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(t(m, d)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean t(int mon, int da) {
        if (mon > 12 || mon < 1) {
            return false;
        }

        if (da > day[mon] || da < 1){
            return false;
        }

        return true;
    }
}