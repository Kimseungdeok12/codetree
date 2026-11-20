import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int mcnt = 0;
        int hj = -1;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if(a > m){
                if(hj == -1){
                    cnt = 1;
                    mcnt = Math.max(mcnt, cnt);
                    hj = a;
                } else{
                    cnt += 1;
                    mcnt = Math.max(mcnt, cnt);
                    hj = a;
                }
            } else{
                cnt = 0;
                hj = -1;
            }
        }

        System.out.print(mcnt);
        // Please write your code here.
    }
}