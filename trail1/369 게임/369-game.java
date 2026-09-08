import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int st = 1;

            if (i % 3 == 0) {
                st = 0;
            } else {
                String a = String.valueOf(i);
                for (int j = 0; j < a.length(); j++) {
                    if (a.charAt(j) == '3' || a.charAt(j) == '6' || a.charAt(j) == '9') {
                        st = 0;
                    }
                } 
            }

            if (st == 1) {
                System.out.print(i + " ");
            } else {
                System.out.print("0 ");
            }
        }
        
    }
}