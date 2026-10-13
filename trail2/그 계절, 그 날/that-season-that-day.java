import java.util.Scanner;
public class Main {
    public static int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        int yyear = 0;

        if (윤년(y)) {
            yyear = 1;
        }

        if (!(t(m, d, yyear))) {
            System.out.print("-1");
            return;
        }

        System.out.print(season(m));
    }

    public static boolean 윤년(int year) {
        if(year % 4 == 0) {
            if(year % 400 != 0 && year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        }

        return false;
    }

    public static boolean t(int mon, int da, int yy) {
        if (mon > 12 || mon < 1) {
            return false;
        }
        if (yy == 1) {
            if (da > day[mon]+1 || da < 1){
                return false;
            } 
        } else {
            if (da > day[mon] || da < 1){
                return false;
            }
        }
        
        return true;
    }

    public static String season(int mon) {
        if (mon == 12 || mon == 1 || mon == 2) {
            return "Winter";
        } else if (mon == 3 || mon == 4 || mon == 5) {
            return "Spring";
        } else if (mon == 6 || mon == 7 || mon == 8) {
            return "Summer";
        } else {
            return "Fall";
        }
    }
}