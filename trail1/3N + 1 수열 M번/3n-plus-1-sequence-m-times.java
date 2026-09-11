import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int m = sc.nextInt(); 
            int cnt = 0;
            
            while (m != 1) {
                cnt++;
            if (m % 2 == 0) {
                m /= 2;
            } else {
                m = m * 3 +1;
            }

            }
            System.out.println(cnt);
        }
    }
}
