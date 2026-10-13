import java.util.Scanner;

class sw {
    int sw;

    public sw(int num) {
        this.sw = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sw a = new sw(sc.nextInt());
        sw b = new sw(sc.nextInt());
        // Please write your code here.
        swap(a, b);

        System.out.print(a.sw + " " + b.sw);
    }

    public static void swap(sw z, sw x){
        int t = x.sw;
        x.sw = z.sw;
        z.sw = t;
    }
}