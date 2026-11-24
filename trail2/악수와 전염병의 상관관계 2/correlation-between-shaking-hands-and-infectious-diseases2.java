import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
        int[] arr = new int[N+1];
        int[][] shake = new int[251][2];
        
        arr[P] = 1;

        int[] sh = new int[N+1];
        Arrays.fill(sh, K);

        for (int i = 0; i < T; i++) {
            int t = sc.nextInt();
            shake[t][0] = sc.nextInt();
            shake[t][1] = sc.nextInt();
        }
        
        for (int i = 0; i < 251; i++) {
            if(shake[i][0] != 0){
                if(arr[shake[i][0]] == 1 && arr[shake[i][1]] == 1){
                    sh[shake[i][0]]--;
                    sh[shake[i][1]]--;
                    continue;
                } else if(arr[shake[i][0]] == 1 && arr[shake[i][1]] == 0){
                    if(sh[shake[i][0]] > 0){
                        arr[shake[i][1]] = 1;
                        sh[shake[i][0]]--;                        
                    }                   
                } else if(arr[shake[i][0]] == 0 && arr[shake[i][1]] == 1){
                    if(sh[shake[i][1]] > 0){
                        arr[shake[i][0]] = 1;
                        sh[shake[i][1]]--;                        
                    }                   
                }
            }
        }

        for (int i = 1; i < N+1; i++){
            System.out.print(arr[i]);
        }
    }
}