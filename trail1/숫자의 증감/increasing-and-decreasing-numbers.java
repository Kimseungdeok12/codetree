import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int b = sc.nextInt();

        if (a.equals("A")) {
            for (int i = 1; i <= b; i++){
                System.out.print(i + " ");
            }
        } else{
            for (int i = b; i >= 1; i--){
                System.out.print(i + " ");
            }
        }
    }
}