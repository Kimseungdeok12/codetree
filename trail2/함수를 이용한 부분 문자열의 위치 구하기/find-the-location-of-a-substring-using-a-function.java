import java.util.Scanner;
public class Main {
    public static String text;
    public static String pattern;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        // Please write your code here.
        System.out.print(def());
    }

    public static int def(){
        for(int i = 0; i <= text.length() - pattern.length(); i++) {
            if(text.substring(i,i + pattern.length()).equals(pattern)) {
                return i;
            }
        }

        return -1;
    }
}