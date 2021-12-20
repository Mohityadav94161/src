package Div2;
import java.util.Scanner;

public class EzzatandTwoSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double  n = sc.nextDouble();
            double a[] = new double[(int)n];
            double max = Integer.MIN_VALUE;
            double sum = 0;
            for(int i = 0 ; i< n ; i++){
                a[i] = sc.nextDouble();
                sum +=a[i];
                max = Math.max(a[i], max);
            }
            double res = max + (sum-max)/(n-1);
            System.out.println(res);
        }
        sc.close();
    }
}
