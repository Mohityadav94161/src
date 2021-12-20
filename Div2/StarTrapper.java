package Div2;
import java.util.*;
public class StarTrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0 ; j< t ; j++){
            int n = sc.nextInt();
            int[][]arr = new int[n][2];
            for(int i = 0 ; i < n ;i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            int sol = solve(n ,arr ,w1,w2);

        }
    }
    public static int solve(int n , int[][]arr , int w1 , int w2) {
        if(n<2){
            return -1;
        }
        else{
            
        }
        return 0;
    }
}
