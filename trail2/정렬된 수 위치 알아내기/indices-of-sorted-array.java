import java.util.Scanner;
import java.util.Arrays;

class Num {
    int v;
    int idx;

    public Num(int v, int idx) {
        this.v = v;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Num[] arr = new Num[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr[i] = new Num(a, i + 1);
        }

        Arrays.sort(arr, (a, b) -> {
            if (a.v != b.v) {
                return Integer.compare(a.v, b.v);
            }
            return a.idx - b.idx;
        });

        for (int i = 0; i < n; i++) {
            result[arr[i].idx - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}