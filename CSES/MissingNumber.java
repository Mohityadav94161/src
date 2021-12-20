import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mysum = n*(n+1)/2;
        long sum = 0;
        for(int i = 0 ; i< n-1 ; i++){
            long a = sc.nextLong();
            // System.out.print(a+" ");
            sum += a;
        }
        // long mysum = n*(n-1)/2;
        System.out.print(mysum-sum);
        // System.out.print("hlo");
    }
}
