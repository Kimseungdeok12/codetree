import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        long n = 0;
        long c = 1;

        for(int i = binary.length() - 1; i >= 0; i--) {
            if(binary.charAt(i) == '1') {
                n += c;
            }
            c *= 2;
        }

        n *= 17;

        StringBuilder r = new StringBuilder();

        while(n > 0) {
            r.append(n % 2);
            n /= 2;
        }

        System.out.print(r.reverse());
    }
}