import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int cnt = -1;

        String str = a;

        for(int i = 0; i < b.length(); i++) {
            if(str.equals(b)) {
                cnt = i;
                break;
            }
            str = a.substring(b.length()-1,b.length()) + a.substring(0,b.length()-1);

            a = str;
        }

        System.out.print(cnt);
    }
}
