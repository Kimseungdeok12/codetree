import java.util.Scanner;

class num{
    int n;

    public num(int z){
        this.n = z;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num a = new num(sc.nextInt());
        num b = new num(sc.nextInt());
        // Please write your code here.

        swap(a, b);

        System.out.print(a.n + " " + b.n);
    }

    public static void swap(num z, num x){
        if(z.n > x.n){
            z.n = z.n * 2;
            x.n = x.n + 10;
        } else{
            x.n = x.n * 2;
            z.n = z.n + 10;
        }
    }
}