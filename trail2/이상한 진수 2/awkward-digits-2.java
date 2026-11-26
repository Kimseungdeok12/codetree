import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder z = new StringBuilder(a);
        
        for(int i = 0; i < z.length(); i++){
            if(z.charAt(i) == '0'){
                z.setCharAt(i, '1');
                break;
            }

            if(i == z.length() - 1){
                if(z.charAt(i) != '0'){
                    z.setCharAt(i, '0');
                }
            }
        }
        
        System.out.print(Integer.parseInt(z.toString(), 2));
    }
}