package Div2;
import java.util.Arrays;
import java.util.Scanner;

public class Moamenandksubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            int b[] = new int[n];
            for(int i = 0 ;i<n ; i++){
                arr[i] = sc.nextInt();
                b[i] = arr[i];
            }
            Arrays.sort(b);
            int count = 1 ;
            
            for(int i =1 ; i< n ; i++){
                if(arr[i-1]<arr[i]){
                    int j = Arrays.binarySearch(b, arr[i]);
                    if(b[j-1]==arr[i-1] && b[j]==arr[i]){
                    }
                    
                    else{
                        count++;
                    }
                    
                }
                else{
                    count++;
                   
                }
            }
            if(count>k){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
        sc.close();
    }
}
