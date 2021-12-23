package arrayes;

public class MaximumlengthBitonicSubarray {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {12, 4, 78, 90, 45, 23};
        System.out.println(Solution.bitonic(arr,n));
    }
}
class Solution {
    static int bitonic(int[] arr, int n) {
        int count = 3;
        if(n<3)return n;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = 1;
        for(int i = 0 ; i< n-1; i++){
            if(arr[i+1]>=arr[i]){
                left[i+1] = left[i]+1;
            }
            else{
                left[i+1] = 1;
            }
        }
        
        right[n-1] = 1;
         for(int i = n-1 ; i>0; i--){
            if(arr[i-1]>=arr[i]){
                right[i-1] = right[i]+1;
            }
            else{
                right[i-1] = 1;
            }
            
        }
        for(int i = 0 ; i< n-1 ; i++){
            count = Math.max(count,left[i]+right[i+1]);
        }
        // for(int i:left){
        //     System.out.println(i);
        // }
        return count;
    }

}