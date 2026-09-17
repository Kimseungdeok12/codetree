import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[10];

        int st = 0;

        for (int i = 1; i <= 10; i++) {
            arr[i-1] = i * n;
            if (st < 2 && arr[i-1] % 5 == 0) {
                st++;
            } else if(st >= 2){
                break;
            }
            System.out.print(arr[i-1] + " ");         
        }
    }   
}
