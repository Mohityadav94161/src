public class palindromicLCS {
    public static void main(String[] args) {
        
    }
    public static int LCS(String str) {
        StringBuffer s = new StringBuffer(str);
        int n = str.length();
        String rev = ""; 
        for(int i = 0 ; i< n ; i++){
             rev +=s.charAt(i);
        }
        int t[][] = new int[n+1][n+1];
        for(int i = 0 ; i< n+1;i++){
            for(int j = 0 ; j<n+1; j++){
                if(i ==0 || j==0){
                    t[i][j] = 0;
                }
                else{
                    if(str.charAt(i-1) == rev.charAt(j-1)){
                        t[i][j] = t[i-1][j-1]+1;
                    }
                    else{
                        t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                    }

                }
            }
        }
        return t[n][n];
               
    }
}
