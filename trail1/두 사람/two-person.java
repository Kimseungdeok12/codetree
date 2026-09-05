import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aa = sc.nextInt();
        String as = sc.next();
        int ba = sc.nextInt();
        String bs = sc.next();

        if ((aa >= 19 && as.equals("M")) || (ba >= 19 && bs.equals("M"))) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}