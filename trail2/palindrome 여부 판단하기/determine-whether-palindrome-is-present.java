import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.

        if (def(input)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }


    }

    public static boolean def(String a){
        String str = new StringBuilder(a).reverse().toString();

        if (str.equals(a)){
            return true;
        } else {
            return false;
        }
    }
}