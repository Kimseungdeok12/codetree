import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        int cnt = 0;

        for(int i = 0; i < A.length()-1; i++){
            char a = A.charAt(i);
            if(a == '('){
                for(int j = i+1; j < A.length(); j++){
                    char b = A.charAt(j);
                    if(b == ')'){
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}