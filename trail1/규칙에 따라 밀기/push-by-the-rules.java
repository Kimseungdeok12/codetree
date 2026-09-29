import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        for(int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c == 'L') {
                a = a.substring(1)+a.substring(0,1);
            } else {
                a = a.substring(a.length()-1)+a.substring(0,a.length()-1);
            }
        }

        System.out.print(a);
    }
}