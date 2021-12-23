package arrayes;
import java.util.*;
public class MinimizeTheHeightsII  {
    public static void main(String[] args) {
        int K = 2, N = 4;
        int Arr[] = {1, 5, 8, 10};
        Solution.getMinDiff(Arr, N, K);
    }
}
class Solution {
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = (arr[n - 1] + k) - (arr[0] + k); 

        int tempmax = arr[n - 1] - k; 
        int tempmin = arr[0] + k; 
        int max, min;
        for (int i = 0; i < n - 1; i++) {
            if (tempmax > (arr[i] + k)) {
                max = tempmax;
            } else {
                max = arr[i] + k;
            }
            

            if (tempmin < (arr[i + 1] - k)) {
                min = tempmin;
            } else {
                min = arr[i + 1] - k;
            }
            

            if (min >= 0) {
                if (ans > (max - min)) {
                    ans = max - min;
                }
               
            } else {
                min = arr[0] + k;
         
          }
        }
         return ans ;
        
        
    }
}
