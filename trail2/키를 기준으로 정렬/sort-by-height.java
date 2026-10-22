import java.util.Scanner;
import java.util.Arrays;

class People{
    String name;
    int height;
    int weight;

    public People(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        People[] p = new People[n];

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            int b = sc.nextInt();
            int c = sc.nextInt();

            p[i] = new People(a, b, c);
        }

        Arrays.sort(p, (a, b) -> a.height - b.height);

        for (int i = 0; i < n; i++) {
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }

        // Please write your code here.
    }
}