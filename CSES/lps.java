import java.util.*; 
public class lps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = sc.next();
        lpss(pat);
    }
    public static void lpss(String pattern) {
        int len =  pattern.length();
        int lps[] = new int[len];
        lps[0] = 0 ;
        int i = 1;
        int j = 0 ;
        while(i<len){
            if(pattern.charAt(i) == pattern.charAt(j)){
                lps[i]  = j+1;
                j++;
                i++;
            }
            else{
                if(j != 0){
                    j = lps[j-1];
                }
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        for(int ii = 0 ; ii< lps.length ; ii++){
            System.out.print(lps[ii]+" ");
        }
    }

} 
