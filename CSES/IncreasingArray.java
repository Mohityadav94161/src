import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
      
        long res = 0 ;
        long a = 0;
        for(int i = 1 ; i< n; i++){

            long b = sc.nextLong();
            System.out.println("a is "+ a+ " b is "+ b );
             if(a>b){
                 res+= a-b;
                
             }
             b =a;
             
        }
        System.out.print(res);
    }
}
