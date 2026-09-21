import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        String[] arr = new String[n];

        int cnt = 0;

        int max = 0;


        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for(int i = 0; i < n; i++) {
            String s = arr[i];

            if (s.charAt(0) == 'a') {
                cnt++;
            }

            max += s.length();
        }


        System.out.println(max + " " + cnt);
    }
}