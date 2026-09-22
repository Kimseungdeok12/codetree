import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String a = sc.next();

        if (s.indexOf(a) != -1) {
            System.out.print(s.indexOf(a));
        }
        else {
            System.out.print(-1);
        }
    }
}

