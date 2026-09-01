import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();

        String n = a == 100 ? "pass" : "failure";

        System.out.println(n);
    }
}
