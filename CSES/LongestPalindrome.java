import java.util.*;
public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(palind(s));
        
    }
    public static String palind(String s) {
        StringBuffer str = new StringBuffer(s);
        int low = 0; 
        int high = 0;
        int max = 0 , maxh = 0, maxl = 0;
        // odd length palindrome
        for(int i = 0  ; i< str.length() ; i++){
            low = i-1;
            high = i+1;
            while(low>=0 && high < str.length() && str.charAt(low)==str.charAt(high)){
                low--;
                high++;
                if(max<high-low+1){
                    max = high-low+1;
                    maxh = high;
                    maxl = low;
                }
            }
            // even length
            low = i-1;
            high = i;
            while(low>=0 && high < str.length() && str.charAt(low)==str.charAt(high)){
                low--;
                high++;
                if(max<high-low+1){
                    max = high-low+1;
                    maxh = high;
                    maxl = low;
                }
            }
        }
        if(max == 0 || max == 1){
            return str.substring(0, 1);
        }
        String strss = str.substring(maxl+1, maxh);
        return strss;

    }
}
