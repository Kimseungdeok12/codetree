import java.util.Scanner;
public class Main {
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        dfs(m);

        System.out.print(cnt);
    }

    public static void dfs(int num){
        while(num != 1) {
            cnt += arr[num -1];

            if (num % 2 == 0){
                num = num / 2;
            } else {
                num-=1;
            }
        }

        cnt += arr[0];
    }
}