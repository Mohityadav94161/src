/**
 * CountInversions
 */
import java.util.*;
public class CountInversions {
    public static long count(long arr[] , long l , long h ) {
        long res = 0 ;
        if(l<h){
            long m = l+(h-l)/2;
            res+=count(arr, l, m);
            res+=count(arr, m+1, h);
            res+=countinver(arr, l, m, h);
        }
        return res;
    }

    public static void main(String[] args) {
        long arr[] = {10 , 10 ,10};
        long d = count(arr, 0, arr.length-1);
        System.out.println(d);
        
    }
    public static long countinver(long arr[] , long l , long m , long h) {
        long left[] = new long[(int)(m-l+1)];
        long right[] = new long[(int)(h-m)];
        for(int i = 0 ; i < m-l+1 ; i++){
            left[i] = arr[(int)(i+l)];
        }
        for(int i =0 ; i< h-m ; i++){
            right[i] = arr[(int)(m+1+i)];
        }
        int  i=0,j=0;
        int k = (int)l;
        long res = 0 ;
        long n1 = left.length , n2 = right.length;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }
            else{
                arr[k] = right[j];
                j++;
                k++;
                res += (n1-i);
            }
        }

        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = right[j];
            k++;j++;
        }

        return res;
    }
}