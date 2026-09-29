import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        for(int i = 0; i <= a.length(); i++) {
            System.out.println(a);
            a = a.substring(a.length()-1)+a.substring(0,a.length()-1);
        }
    }
}