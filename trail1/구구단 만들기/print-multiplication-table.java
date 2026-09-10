import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = b; j >= a; j--) {
                if (j % 2 == 0) {
                    System.out.print(j + " * " + i + " = " + i*j);
                    if (a % 2 == 0) {
                        if (j != a) {
                            System.out.print(" / ");
                        } else {
                            System.out.println("");
                        }
                    } else {
                        if (j != a/2 + 1) {
                            System.out.print(" / ");
                        } else {
                            System.out.println("");
                        }
                    }
                }
                
                    
            }
            
        } 
    }
}