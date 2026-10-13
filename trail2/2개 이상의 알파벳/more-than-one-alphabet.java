import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        int[] arr = new int[26];

        def(arr, A);

        int cnt = 0;

        for(int i = 0; i < 26; i++){
            if(arr[i] != 0){
                cnt++;
            }

            if (cnt > 1){
                System.out.print("Yes");
                return;
            }
        }

        System.out.print("No");
    }

    public static void def(int[] a, String str){
        for(int i = 0; i < str.length(); i++){
            a[str.charAt(i) - 'a']++;
        }
    }
}