import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = 0;

        int[] arr = new int[b];

        while(a > 1){
            int q = a % b;
            arr[q]++;

            a = a / b;  
        }


        for (int i = 0; i < b ; i++) {
            r += arr[i] * arr[i];
        }

        System.out.print(r);
    }
}
