package Array;

public class MinimumPath {

	public static void main(String[] args) {
		int[][]grid = {{1,2,3},{4,5,6}};
		 
		System.out.println();
		int[][]dp = minPathSum(grid);
		for(int i = 0; i< dp.length ; i++) {
			for(int j = 0 ; j< dp[0].length ; j++) {
				System.out.print(dp[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}
	 public static int[][] minPathSum(int[][] grid) {
		    int m = grid.length;
	        int n = grid[0].length;
	        int [][]dp =  new int[m][n];
	        dp[m-1][n-1] = grid[m-1][n-1];
	        for(int j = n-2 ; j>=0 ; j--) {
	            dp[m-1][j] = dp[m-1][j+1]+grid[m-1][j];
	        }
	        for(int j = m-2 ; j>=0 ; j--) {
	            dp[j][n-1] = grid[j][n-1]+dp[j+1][n-1];
	        }
	    
	        for(int i = n-2 ; i>=0 ; i--) {
	            for(int j = m-2 ; j >=0; j--) {
	                dp[j][i] = grid[j][i]+Math.min(dp[j+1][i],dp[j][i+1]);
	            }
	        }
	        return dp;
	    }

}
