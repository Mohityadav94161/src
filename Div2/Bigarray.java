package Div2;
import java.util.*;
public class Bigarray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       int count = 0;
       while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0 ;
            for(int i = 0 ; i< n; i++){
                arr[i] = sc.nextInt();
                sc.close();
                sum +=arr[i];
            } 
            int y = n;
            boolean e = true;
            while(e){
                int sum2 = sum/y;
                int check = sum;
                for(int i = 0 ;i<n;i++){
                    
                    if(arr[i]>sum2){
                        count++;
                        y--;
                        sum = sum-arr[i];
                    }
                    else if(arr[i]<sum2){

                    }
                }
                if(y<=0 || count == n){
                    e = false;
                }
                if(check == sum){
                    e = false;
                }
            }
            System.out.println(count);
       } 
    }
}
