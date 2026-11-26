import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int r = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++){
            int c = 0;
            for (int j = 0; j < n; j++){
                if(j == i){
                    continue;
                } else{
                    c += Math.abs((i-j)*a[j]);
                }
            }

            r = Math.min(r, c);
        }

        System.out.print(r);
    }
}