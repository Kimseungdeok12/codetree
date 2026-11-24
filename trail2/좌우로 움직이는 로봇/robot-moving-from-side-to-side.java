import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int Atime = 0;
        int Btime = 0;

        int[] A = new int[2000001];
        int[] B = new int[2000001];

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            char a = sc.next().charAt(0);

            for (int j = 0; j < b; j++) {
                Atime++;

                if (a == 'R') {
                    A[Atime] = A[Atime - 1] + 1;
                } else {
                    A[Atime] = A[Atime - 1] - 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int b = sc.nextInt();
            char a = sc.next().charAt(0);

            for (int j = 0; j < b; j++) {
                Btime++;

                if (a == 'R') {
                    B[Btime] = B[Btime - 1] + 1;
                } else {
                    B[Btime] = B[Btime - 1] - 1;
                }
            }
        }

        int time = Math.max(Atime, Btime);

        for (int i = Atime + 1; i <= time; i++) {
            A[i] = A[Atime];
        }

        for (int i = Btime + 1; i <= time; i++) {
            B[i] = B[Btime];
        }

        int cnt = 0;

        for (int i = 1; i <= time; i++) {
            if (A[i] == B[i] && A[i - 1] != B[i - 1]) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}