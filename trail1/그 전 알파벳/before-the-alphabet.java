import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 1; i++) {
            int a = (int)sc.next().charAt(0);

            if(a == 97) {
                System.out.print('z');
            } else {
                System.out.print((char)(97+(a-97-1)%26));
            }
        }
    }
}