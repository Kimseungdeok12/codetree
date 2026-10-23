import java.util.Scanner;
import java.util.Arrays;

class Cd {
    int x;
    int y;
    int num;

    public Cd(int x, int y, int num){
        this.x = x;
        this.y = y;
        this.num = num;
    }
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cd[] arr = new Cd[n];
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            arr[i] = new Cd(a, b, (i+1));
        }

        Arrays.sort(arr, (a, b) ->
            (Math.abs(a.x) + Math.abs(a.y)) -
            (Math.abs(b.x) + Math.abs(b.y))
        );

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].num);
        }
        
    }
}