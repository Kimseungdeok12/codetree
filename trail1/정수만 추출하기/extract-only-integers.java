import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int cnt = 0;
        String str = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                str += a.charAt(i);
            } else {
                break;
            }
        }

        cnt += Integer.parseInt(str);
        str = "";

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) >= '0' && b.charAt(i) <= '9') {
                str += b.charAt(i);
            } else {
                break;
            }
        }

        cnt += Integer.parseInt(str);

        System.out.println(cnt);
    }
}