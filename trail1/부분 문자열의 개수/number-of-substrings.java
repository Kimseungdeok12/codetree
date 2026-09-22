import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String a = sc.next();

        int ex1 = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.substring(i,i+2).equals(a)) {
                ex1++;
            }
        }

        System.out.print(ex1);


    }
}

