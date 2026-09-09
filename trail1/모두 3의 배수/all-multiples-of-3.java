import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean st = true;
        
        for (int i = 1; i <= 5; i++) {
            int a = sc.nextInt();
            if (a % 3 != 0) {
                st = false;
            }
        }
        if (st) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
