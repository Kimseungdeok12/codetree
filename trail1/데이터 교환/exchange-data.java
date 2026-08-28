public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5, b = 6, c = 7;
        int t1 = b, t2 = c;

        b = a;
        c = t1;
        a = t2;

        System.out.println(a);
        System.out.println(b);
        System.out.print(c);
    }
}