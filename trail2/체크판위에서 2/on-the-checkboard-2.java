import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        int cnt = 0;
        
        if(grid[0][0] == 'W'){
            for(int i = 1; i < R-2; i++){
                for(int j = 1; j < C-2; j++){
                    if(grid[i][j] == 'B'){
                        for(int k = i+1; k < R-1; k++){
                            for(int l = j+1; l < C-1; l++){
                                if(grid[k][l] == 'W'){
                                    if(grid[k][l] != grid[R-1][C-1]){
                                        cnt++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if(grid[0][0] == 'B'){
            for(int i = 1; i < R-2; i++){
                for(int j = 1; j < C-2; j++){
                    if(grid[i][j] == 'W'){
                        for(int k = i+1; k < R-1; k++){
                            for(int l = j+1; l < C-1; l++){
                                if(grid[k][l] == 'B'){
                                    if(grid[k][l] != grid[R-1][C-1]){
                                        cnt++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.print(cnt);

        
    }
}

