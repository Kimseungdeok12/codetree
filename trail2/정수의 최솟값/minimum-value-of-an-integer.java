 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(de(a, b, c));
    }

    public static int de(int num1, int num2, int num3){
        int a = 0;

        a = Math.min(num1, num2);
        a = Math.min(a, num3);
        
        return a;
    }
}
