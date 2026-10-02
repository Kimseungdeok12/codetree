import java.util.Scanner;

public class Main {
    public static void print5Stars() {
        System.out.print("12345^&*()_");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
            print5Stars(); 
    }
}
