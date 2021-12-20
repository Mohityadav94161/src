package String;



public class longestPalindrome {

    public static void main(String[] args) {

        String str = "hellowo";
        
        int n = str.length();
        int len  = 1 ;
        int res = 0 ;
        

        for(int i = 1 ; i < n; i++){
            int low = i-1;
            int high = i+1;
            len  = 0 ;
            while(low>=0 && high < n && str.charAt(low) == str.charAt(high)){
                    len++;
                    low--;
                    high++;
                
            }

            res = Math.max(res,len);


        }
        System.out.println(res);

    }
}