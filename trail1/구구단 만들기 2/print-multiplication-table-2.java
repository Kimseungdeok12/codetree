import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 2; i <= 8; i+=2) {
            for (int j = b; j >= a; j--) {
                System.out.print(j + " * " + i + " = " + i*j);
                if (j != a) {
                    System.out.print(" / ");
                } else {
                    System.out.println("");
                }
            }
        } 
    }
}