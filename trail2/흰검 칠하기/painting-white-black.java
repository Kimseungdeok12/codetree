import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] white = new int[200001];
        int[] black = new int[200001];
        int[] all = new int[200001];
        int st = 100000;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            char b = sc.next().charAt(0);

            if (b == 'R') {
                for (int j = st; j < st + a; j++){
                    black[j] += 1;
                    all[j] = 1;
                }

                st = st + a-1;
            }

            else if (b == 'L') {
                for (int j = st; j > st - a; j--){
                    white[j] += 1;
                    all[j] = -1;
                }

                st = st - a + 1;
            }
        }

        int z = 0;
        int x = 0;
        int c = 0;

        for (int i = 0; i < 200001; i++){
            if (black[i] >= 2 && white[i] >= 2){
                c += 1;
            } else if(all[i] == 1){
                x += 1;
            } else if (all[i] == -1){
                z += 1;
            }
        }

        System.out.print(z + " " + x + " " + c);

        // Please write your code here.
    }
}