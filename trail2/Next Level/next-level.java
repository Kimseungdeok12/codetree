import java.util.Scanner;

class status{
    String id;
    int level;

    public status(){
        this.id = "codetree";
        this.level = 10;
    }

    public status(String id, int level){
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        status a = new status();
        status b = new status(sc.next(), sc.nextInt());

        System.out.println("user " + a.id + " lv " + a.level);
        System.out.println("user " + b.id + " lv " + b.level);

        // Please write your code here.
    }
}