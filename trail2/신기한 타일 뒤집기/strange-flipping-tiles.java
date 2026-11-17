import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 100000;
        int[] arr = new int[200001];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'R') {
                for (int j = st; j < st + x; j++){
                    arr[j] = 1;
                }
                st = st + x - 1;
            } else {
                for (int j = st; j > st - x; j--){
                    arr[j] = 2;
                }
                st = st - x + 1;
            }           
        }

        int w = 0;
        int b = 0;

        for (int i = 0; i < 200001; i++){
            if(arr[i] == 1) {
                b++;
            } else if(arr[i] == 2){
                w++;
            }
        }

        System.out.print(w + " " + b);
        // Please write your code here.
    }
}