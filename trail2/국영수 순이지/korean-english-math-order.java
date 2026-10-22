import java.util.Scanner;
import java.util.Arrays;

class People{
    String name;
    int kor;
    int eng;
    int math;

    public People(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
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
            int d = sc.nextInt();

            p[i] = new People(a, b, c, d);
        }

        Arrays.sort(p, (a, b) -> {
            if (a.kor != b.kor){
                return b.kor - a.kor;
            } else{
                if (a.eng != b.eng){
                    return b.eng - a.eng;
                }
                return b.math - a.math;
                }
            });
        
        
        for (int i = 0; i < n; i++) {
            System.out.println(p[i].name + " " + p[i].kor + " " + p[i].eng + " " + p[i].math);
        }

        // Please write your code here.
    }
}