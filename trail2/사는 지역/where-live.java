import java.util.Scanner;
import java.util.Arrays;

class Adress{
    String name, address, region;

    public Adress(String name,String address,String region){
        this.name = name;
        this.address = address;
        this.region = region;
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Adress[] ad = new Adress[n];
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            
            ad[i] = new Adress(name, address, region);
        }

        Arrays.sort(ad, (a, b) -> a.name.compareTo(b.name));

        System.out.println("name " + ad[n-1].name);
        System.out.println("addr " + ad[n-1].address);
        System.out.println("city " + ad[n-1].region);

        // Please write your code here.
    }
}
