import java.util.Scanner;
public class Main {
    public static int r = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int[] a = new int[n1];
        int[] b = new int[n2];
        
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        
        if (n2 > n1){
            System.out.print("No");
            return;
        } else{
            for(int i = 0; i <= n1 - n2; i++){
                if(listCheck(i, a, b)){
                    r = 1;
                    break;
                }
            }
        }

        if(r == 1) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean listCheck(int num, int[] arr1, int[] arr2) {
        int st = 1;
        
        for(int i = 0; i < arr2.length; i++) {
            if(arr1[i + num] != arr2[i]){
                st = 0;
                break;
            }
        }

        if (st == 0) {
            return false;
        } else {
            return true;
        }
    }
}