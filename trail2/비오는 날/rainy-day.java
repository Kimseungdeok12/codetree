import java.util.Scanner;
import java.util.Arrays;

class Weat{
    String date;
    String day;
    String weather;

    public Weat(String date, String day, String weather){
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weat[] wea = new Weat[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            wea[i] = new Weat(date, day, weather);
        }

        Arrays.sort(wea, (a, b) -> a.date.compareTo(b.date));

        for (int i = 0; i < n; i++) {
            if (wea[i].weather.equals("Rain")){
                System.out.print(wea[i].date + " " + wea[i].day + " " + wea[i].weather);
                break;
            }
        }
    }
}