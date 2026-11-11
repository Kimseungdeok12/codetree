import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2001];

        int start = 1000;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            char b = sc.next().charAt(0);

            if(b == 'R'){
                for(int j = start; j < start+a; j++){
                    arr[j] += 1;
                }
                start += a;
            } else {
                for(int j = start-1; j >= start-a; j--){
                    arr[j] += 1;
                }
                start -= a;
            }      
        }

        int cnt = 0;

        for (int i = 0; i < 2001; i++) {
            if(arr[i] >= 2) {
                cnt += 1;
            }
        }

        System.out.print(cnt);

    }
}