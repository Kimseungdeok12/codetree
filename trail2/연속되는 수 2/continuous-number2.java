import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int mcnt = 0;
        int hj = -1;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (i == 0){
                cnt = 1;
                mcnt = 1;
                hj = a;
            } else {
                if(hj == a){
                    cnt += 1;
                    mcnt = Math.max(mcnt, cnt);
                }else{
                    mcnt = Math.max(mcnt, cnt);
                    cnt = 1;
                    hj = a;
                }
            }
        }

        System.out.print(mcnt);
        // Please write your code here.
    }
}