import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            } else {
                arr[i] = a;
            }
        }

        for (int i = arr.length-1; i >-1 ; i--) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}