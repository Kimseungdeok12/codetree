import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        int stat = 0;

        if(n > m) {
            for(int i = 0; i < n - m + 1; i++) {
                int st = 1;
                if (arr1[i] == arr2[0]) {
                    for(int j = 0; j < m; j++) {
                        if (arr1[i+j] != arr2[j]) {
                            st = 0;
                        }
                    }
                } else {
                    st = 0;
                }

                if (st == 1) {
                    stat = 1;
                    break;
                }
            }
        } else {
            for(int i = 0; i < m-n + 1; i++) {
                int st = 1;
                if (arr2[i] == arr1[0]) {
                    for(int j = 0; j < m; j++) {
                        if (arr2[i+j] != arr1[j]) {
                            st = 0;
                        }
                    }
                } else {
                    st = 0;
                }

                if (st == 1) {
                    stat = 1;
                    break;
                }
            }
        }

        if(stat == 0) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }
    }
}