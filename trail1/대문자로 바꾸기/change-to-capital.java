
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                char a = sc.next().charAt(0);
                a = Character.toUpperCase(a);
                System.out.print(a + " ");
            }

            System.out.println();
        }
    }
}

