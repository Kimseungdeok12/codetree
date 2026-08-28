import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] arr = s.split(":");

        int a = Integer.parseInt(arr[0]) + 1;

        System.out.print(a+":"+arr[1]);
    }
}