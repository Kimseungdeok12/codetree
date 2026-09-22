import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();

        char[] arr = a.toCharArray();

        char c = arr[0];

        char ch = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                arr[i] = ch;
            }

            else if (arr[i] == ch) {
                arr[i] = c;
            }
        }
        String ss = String.valueOf(arr);

        System.out.println(ss);
    }
}