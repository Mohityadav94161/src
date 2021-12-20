package Array;

public class dp {

	public static void main(String[] args) {
		int a[] = {7 ,3 ,3 ,4 ,7 ,10 ,4 ,6};
		int n = 8;
		findPartition( a, n);

	}
	public static boolean findPartition(int[] a, int n)
    {
        int sum = 0;
        for(int i = 0 ;i < n; i++){
            sum +=a[i];
        }
        if(sum%2 != 0){
            return false; 
        }
        // System.out.println(sum);
        boolean dp[][] = new boolean[sum/2+1][n+1];
        for(int i = 1 ; i<= sum/2;i++){
            dp[i][0] = false;
        }
        for(int i = 0 ; i<=n;i++){
            dp[0][i] = true;
        }
        for(int i = 1 ; i<= sum/2;i++){
            for(int j = 1 ; j <= n;j++){
                  dp[i][j] = dp[i][j-1];
                
                if(i>=a[j-1]){
                    dp[i][j] =  dp[i][j]||dp[i-a[j-1]][j-1];
                    
                }
                
            }
        }    
         for(int i = 0 ; i< sum/2;i++){
             for(int j = 0 ; j < n;j++){
                 System.out.print(dp[i][j] + " ");
             }
             System.out.println("");
         }    
        
    
        
        
        return dp[sum/2][n];
    }

}
