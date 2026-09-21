import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String result = "";
        int cnt = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                cnt++;
            } else {
                result += str.charAt(i - 1);
                result += cnt;
                cnt = 1;
            }
        }

        result += str.charAt(str.length() - 1);
        result += cnt;

        System.out.println(result.length() );
        System.out.println(result);
    }
}