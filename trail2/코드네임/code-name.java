import java.util.Scanner;

class User {
    char codeName;
    int score;

    public User(){
        this.codeName = '\0';
        this.score = 0;
    }

    public User(char codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }
}

public class Main {
    public static final int MAX_N = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User[] users = new User[MAX_N];
        for (int i = 0; i < MAX_N; i++) {
            users[i] = new User();
            users[i].codeName = sc.next().charAt(0);
            users[i].score = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int ii = 0;

        for (int i = 0; i < MAX_N; i++) {
            if(min > users[i].score){
                min = users[i].score;
                ii = i;
            }
        }

        System.out.print(users[ii].codeName + " " + users[ii].score);
    }
}
