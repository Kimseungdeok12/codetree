import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if (max < str1.length()) {
            max = str1.length();
        }
        if (max < str2.length()) {
            max = str2.length();
        }
        if (max < str3.length()) {
            max = str3.length();
        }
        if (min > str1.length()) {
            min = str1.length();
        }
        if (min > str2.length()) {
            min = str2.length();
        }
        if (min > str3.length()) {
            min = str3.length();
        }

        System.out.print(max-min);
    }
}

