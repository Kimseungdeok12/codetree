import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        char a = sc.next().charAt(0);

        int cnt = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 2; j < 4; j++) {
                if (a == arr[i].charAt(j)) {
                    cnt += 1;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        System.out.println(cnt);

    }
}
