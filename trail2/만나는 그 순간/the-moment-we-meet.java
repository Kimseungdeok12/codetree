import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int Atime = 0;
        int Btime = 0;
        int[] A = new int[1000001];
        int[] B = new int[1000001];

        for (int i = 0; i < n; i++) {
            char a = sc.next().charAt(0);
            int b = sc.nextInt();

            if (a == 'R') {
                for (int j = 0; j < b; j++){
                    Atime++;
                    A[Atime] = A[Atime-1] + 1;
                }
            } else{
                for (int j = 0; j < b; j++){
                    Atime++;
                    A[Atime] = A[Atime-1] - 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            char a = sc.next().charAt(0);
            int b = sc.nextInt();

            if (a == 'R') {
                for (int j = 0; j < b; j++){
                    Btime++;
                    B[Btime] = B[Btime-1] + 1;
                }
            } else{
                for (int j = 0; j < b; j++){
                    Btime++;
                    B[Btime] = B[Btime-1] - 1;
                }
            }
        }
        int st = -1;

        for (int i = 1; i <= Math.min(Atime, Btime); i++) {
            if (A[i] == B[i]) {
                st = i;
                break;
            }
        }

        System.out.print(st);

        // Please write your code here.
    }
}