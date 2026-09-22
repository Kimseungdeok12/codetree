import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();

        char[] arr = a.toCharArray();

        char c = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                arr[i] = arr[0];
            }
        }
        String ss = String.valueOf(arr);

        System.out.println(ss);
    }
}