import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        if (de(n)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    private static boolean de(int a){
        if(a % 2 == 0 && ((a/10) + a%10) % 5 == 0) {
            return true;
        } else {
            return false;
        }
    } 
}