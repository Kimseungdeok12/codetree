import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();

        String s = a.substring(0,1) + a.substring(2,a.length()-2) + a.substring(a.length()-1,a.length());

        System.out.print(s);

    }
}