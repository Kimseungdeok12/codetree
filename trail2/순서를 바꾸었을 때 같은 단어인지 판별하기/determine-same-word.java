import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);

        String wo1 = new String(w1);
        String wo2 = new String(w2);

        if(wo1.equals(wo2)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        
    }
}