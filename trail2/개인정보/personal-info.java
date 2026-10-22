import java.util.Scanner;
import java.util.Arrays;

class People {
    String name;
    int height;
    double weight;

    public People(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        People[] p = new People[5];

        for (int i = 0; i < 5; i++) {
            String a = sc.next();
            int b = sc.nextInt();
            double c = sc.nextDouble();

            p[i] = new People(a, b, c);
        }

        // 이름순 오름차순
        Arrays.sort(p, (a, b) -> a.name.compareTo(b.name));

        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }

        System.out.println();

        // 키순 내림차순
        Arrays.sort(p, (a, b) -> Integer.compare(b.height, a.height));

        System.out.println("height");
        for (int i = 0; i < 5; i++) {
            System.out.println(p[i].name + " " + p[i].height + " " + p[i].weight);
        }
    }
}