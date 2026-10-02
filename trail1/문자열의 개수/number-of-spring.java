import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        String[] arr = new String[201];

        while(true) {
            String str = sc.next();

            if(str.equals("0")) {
                break;
            }

            cnt++;

            arr[cnt] = str;
        }
        System.out.println(cnt);
        for(int i = 1; i <= cnt; i++) {
            if (i % 2 == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}
