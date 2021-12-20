import java.util.*;

public class Towerof {
    public static int count ;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n =  sc.nextInt();
        tohs(n);
        System.out.println(count );
        toh(n,1,2,3);
    }
    public static void toh(int n , int from , int via , int to){
        if(n==1){
            // System.out.println(count++);
            System.out.println(from + " "+ to);
            return;
        }
        toh(n-1,from , to, via );
        System.out.println(from + " " + to);
        toh(n-1 ,  via,from , to);
    }
    public static void tohs(int n ){
        if(n==1){
            
            // System.out.println(from + " "+ to);
            count++;
            return;
            // System.out.println(count);
            
        }
        tohs(n-1);
        count++;
        tohs(n-1 );
    }
}