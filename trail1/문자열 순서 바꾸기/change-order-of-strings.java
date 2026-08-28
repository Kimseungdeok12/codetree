import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        String temp = t;
        t = s;
        s = temp;
        System.out.println(s);
        System.out.println(t);
    }
}
