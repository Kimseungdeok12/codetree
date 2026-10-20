import java.util.Scanner;

class Goods{
    String id;
    int code;

    public Goods(){
        this.id = "codetree";
        this.code = 50;
    }

    public Goods(String id, int code){
        this.id = id;
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Goods g1 = new Goods();
        Goods g2 = new Goods(id2, code2);

        System.out.println("product " + g1.code + " is " + g1.id);
        System.out.println("product " + g2.code + " is " + g2.id);
    }
}