import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        long r = 0;

        int c = 1;

        for(int i = binary.length() - 1; i >= 0; i--){
            if(binary.charAt(i) == '1'){
                r += c;
            }

            c *= 2;
        }

        System.out.print(r);
    }
}