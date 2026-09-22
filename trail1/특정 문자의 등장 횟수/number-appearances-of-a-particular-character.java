import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();

        int ex1 = 0;
        int ex2 = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.substring(i,i+2).equals("ee")) {
                ex1++;
            }

            if (s.substring(i,i+2).equals("eb")) {
                ex2++;
            }
        }

        System.out.print(ex1 + " " + ex2);


    }
}

