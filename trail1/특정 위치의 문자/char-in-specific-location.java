import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        char[] word = new char[]{ 'L', 'E', 'B', 'R', 'O', 'S' };

        char a = sc.next().charAt(0);

        int idx = -1;

        // 문자 탐색
        for (int i = 0; i < 6; i++) {
            if (word[i] == a) {
                idx = i;
            }
        }

        if (idx < 0) {
            System.out.print("None");
        } else {
            System.out.print(idx);
        }
    }
}