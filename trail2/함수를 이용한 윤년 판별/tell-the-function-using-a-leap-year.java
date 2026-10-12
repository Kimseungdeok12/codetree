import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // Please write your code here
        if (def(y)){
            System.out.print("true");
        } else{
            System.out.print("false");
        }
    }

    public static boolean def(int n){
        if(n % 4 == 0) {
            if (n % 100 == 0 && n % 400 != 0){
                return false;
            } else{
                return true;
            }
        } else {
            return false;
        }
    }
}
