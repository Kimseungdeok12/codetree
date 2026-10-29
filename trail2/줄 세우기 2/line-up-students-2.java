import java.util.Scanner;
import java.util.Arrays;

class Peaple{
    int height;
    int weight;
    int num;

    public Peaple(int height, int weight, int num){
        this.height = height;
        this.weight = weight;
        this.num = num;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Peaple[] p = new Peaple[n];

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int nn = i + 1;

            p[i] = new Peaple(h, w, nn);
        }

        Arrays.sort(p, (a, b) ->{
            if(a.height != b.height){
                return a.height - b.height;
            } else{
                return b.weight - a.weight;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(p[i].height + " " + p[i].weight + " " + p[i].num);
        }

        // Please write your code here.
    }
}
