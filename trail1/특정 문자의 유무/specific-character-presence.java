import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();

        boolean ex1 = false;
        boolean ex2 = false;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.substring(i,i+2).equals("ee")) {
                ex1 = true;
            }

            if (s.substring(i,i+2).equals("ab")) {
                ex2 = true;
            }
        }

        if (ex1 == true) {
            System.out.print("Yes ");
        }
        else {
            System.out.print("No ");
        }

        if (ex2 == true) {
            System.out.print("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

