import java.util.Scanner;
import java.util.Arrays;

class People{
    int height;
    int weight;
    int num;

    public People(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        People[] p = new People[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = (i+1);

            p[i] = new People(a, b, c);
        }

        Arrays.sort(p, (a, b) -> {
            if(a.height != b.height) {
                return b.height - a.height;
            }
            return b.weight - a.weight;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(p[i].height + " " + p[i].weight + " " + p[i].num);
        }

        // Please write your code here.
    }
}