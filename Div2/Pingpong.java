package Div2;
import java.util.Scanner;
public class Pingpong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x-1<=0){
                System.out.println(0 + " "+ y);
            }
            else{
                System.out.println(x-1+" "+y);
            }
        }
        sc.close();
    }
}
