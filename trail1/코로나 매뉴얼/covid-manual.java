import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 0;

        for (int i = 0; i < 3; i++) {
            String a = sc.next();
            int n = sc.nextInt();

        if (a.equals("Y")) {
            if (n >= 37) {
                c++;
            } else {
            }
        } else {
            if (n >= 37) {
            } else {
            }
        }
        }

         if (c >= 2) {
            System.out.print("E");
         } else {
            System.out.print("N");
         }
    }
}
