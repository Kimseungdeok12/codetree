import java.util.Scanner;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        
        if(def(a,o,c)){
            if(o == '+') {
                System.out.print(a + " " + "+ " + c + " = " + (a + c));
            } else if(o == '-') {
                System.out.print(a + " " + "- " + c + " = " + (a - c));
            } else if(o == '*') {
                System.out.print(a + " " + "* " + c + " = " + (a * c));
            } else {
                System.out.print(a + " " + "/ " + c + " = " + (a / c));
            }
        } else {
            System.out.print("False");
        }
    }

    public static boolean def(int z, char x, int w){
        if(x == '+' || x == '-' || x == '*' || x == '/'){
            return true;
        } else{
            return false;
        }
    }
}