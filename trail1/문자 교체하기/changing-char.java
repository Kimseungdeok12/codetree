import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();

        char[] arr1 = a.toCharArray();

        char[] arr2 = b.toCharArray();

        arr2[0] = arr1[0];

        arr2[1] = arr1[1];

        String ss = String.valueOf(arr2);

        System.out.println(ss);
    }
}

