/**
 * SumofCubes
 */
package Div2;
import java.util.*;
public class SumofCubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long x = sc.nextLong();
            long low = 1;
            long high = (long)Math.pow(x, 0.3333333333333333333333333333333);
            long sum = 0;
            // System.out.println("high is "+high+" low is "+low);
            boolean is = false;
            while(low<=high&&!is){
                
                sum = (long)Math.pow(low, 3)+ (long)Math.pow(high, 3);
                if(sum>x){
                    high--;
                }
                else if(sum<x){
                    low++;             
                                        // NO
                                        // YES
                                        // NO
                                        // NO
                                        // YES
                                        // YES
                                        // YES
                }
                else if(sum == x){
                    is=  true;
                }
            }

            if(is == true){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}