package Array;
import java.util.*;

public class EfficientJobProcessingService_14 {
	 public int getMax(List<Integer> tasks, List<Integer> weights, int i, int j, int[][] dp) {
	        if (i == 0 || j <= 0) return 0;
	      
	        if (dp[i - 1][j] == 0) {
	            dp[i - 1][j] = getMax(tasks, weights, i - 1, j, dp);
	        }
	        
	        if (j < tasks.get(i - 1)) {
	            dp[i][j] = dp[i - 1][j];    
	        } else {
	            if (dp[i - 1][j - tasks.get(i - 1)] == 0) {
	                
	                dp[i - 1][j - tasks.get(i - 1)] = getMax(tasks, weights, i - 1, j - tasks.get(i - 1), dp);
	            }
	            dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - tasks.get(i - 1)] + weights.get(i));
	        }
	        
	        return dp[i][j];
	    }

		public static void main(String[] args) {
			 
		}
}