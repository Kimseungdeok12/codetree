import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int cnt = 0;

        for(int i = a; i <= b; i++) {
            if (de(i)){
                cnt++;
            } 
        }

        System.out.print(cnt);
    }

    private static boolean de(int a){
        if(a % 3 == 0) {
            return true;
        } else {
            return def(a);
        }
    }

    private static boolean def(int b){
        String s = String.valueOf(b);

        if(s.contains("3") || s.contains("6") || s.contains("9")) {
            return true;
        } else {
            return false;
        }
    } 
}