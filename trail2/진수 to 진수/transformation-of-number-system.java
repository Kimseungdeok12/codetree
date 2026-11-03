import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        int[] arr = new int[30];
        int cnt = 0;

        int trans1 = 0;

        for (int i = N.length() - 1; i >= 0; i--) {
            int s = N.charAt(i) - '0';
            trans1 += (int)Math.pow(A, N.length() - 1 - i) * s;
        }

        while (true) {
            if(trans1 < B) {
                arr[cnt++] = trans1;
                break;
            }
            
            arr[cnt++] = trans1 % B;
            trans1 = trans1 / B;
        }

        for(int i = cnt-1; i >= 0; i--){
            System.out.print(arr[i]);
        }
    }
}