import java.util.Scanner;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i = a; i <= b; i++){
            if (def(i)) {
                cnt += i;
            }
        }

        System.out.print(cnt);
    }

    public static boolean def(int n) {
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}