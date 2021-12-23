package arrayes;
import java.util.*;
public class OptimizeMaxInKlengthSubarray2 {
    public static void main(String[] args) {
        int n = 9, k = 3;
        int arr[] = {1, 2, 3, 1 ,4, 5, 2, 3, 6};
        System.out.println(Solution.max_of_subarrays(arr, n, k));
    }
}
class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer>ar = new ArrayList<>();
        int arr2[] = new int[n];
        nge(arr,n,arr2);
        int j = 0 ;
        for(int i = 0 ; i<= n-k ; i++){
             if(j<i)j = i;
             while(arr2[j]<i+k){
                 j = arr2[j];
             }
             ar.add(arr[j]);
             
        }
        return ar;
    }
    static void nge(int arr[] ,int n , int arr2[]){
        Stack<Integer>st = new Stack<>();
        for(int i = n-1 ; i>=0 ; i--){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                arr2[i] = n;
            }
            else{
                arr2[i] = st.peek();
            }
            st.add(i);
        }
    }
}
