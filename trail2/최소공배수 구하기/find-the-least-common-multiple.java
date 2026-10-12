import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int cnt = 0;

        int num = 0;

        if(n > m) {
            num = m;
        } else {
            num = n;
        }

        while(true) {
            cnt++;

            if((num*cnt) % n == 0 && (num*cnt) % m == 0){
                break;
            }
        }

        System.out.print(num*cnt);
    }
}