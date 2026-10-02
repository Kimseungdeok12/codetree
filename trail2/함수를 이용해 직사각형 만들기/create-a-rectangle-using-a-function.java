import java.util.Scanner;

public class Main {
    public static void print5Stars(int num) {
        for(int i = 0; i < num; i++){
            System.out.print("1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++){
            print5Stars(m); 
        }    
    }
}
