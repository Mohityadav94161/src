package String;

public class palindrome {

	public static void main(String[] args) {
		 String str = "qrrc";
	        int n = str.length();
	        int len  = 0;
	        int res = 0 ;
	        int res1 = 0;
	        String s = "";

	        for(int i = 0 ; i < n; i++){
	            int low = i;
	            int high = i;
	            int low1 = i-1;
	            int high1 = i;
	            
	            while((low>=0 && high < n)&&str.charAt(low) == str.charAt(high)){  
	                    low--;
	                    high++;
	            }
//	            String s = str.substring(low + 1, high);
	            len  = high-low-1;
	            if(res<len) {
	            	s = str.substring(low + 1, high);
	            	res = len;
	            }
	            
	            while((low1>=0 && high1 < n)&&str.charAt(low1) == str.charAt(high1)){  
                    low1--;
                    high1++;
                }
	            len  = high1-low1-1;
	            if(res<len ) {
	            	s = str.substring(low1 + 1, high1);
	            }
	            res = Math.max(res,len);
	            
	            
	        }
	        System.out.println(res1);
	        System.out.println(s);

	    
	}

}
