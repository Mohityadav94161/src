import java.util.*;
public class kmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        boolean mark = false;
        for(int i = 0 ; i< text.length()-1 ; i++){
            if(text.charAt(i) != text.charAt(i+1)){
                mark = true;
            }
        }
        for(int i = 0 ; i< pattern.length()-1 ; i++){
            if(pattern.charAt(i) != pattern.charAt(i+1)){
                mark = true;
            }
        }
        if(mark == false && text.charAt(0)==pattern.charAt(0)){
            System.out.print(text.length()-pattern.length()+1);
        }

        else{
            kmpp(text, pattern) ;
        }    
    }

    public static void kmpp(String text, String pattern) {
        int lentext = text.length();
        int lenpat = pattern.length();
        int lps[] = getlps(pattern);
        int i = 0, j = 0;
        int count = 0 ;
        while (i < lentext && j < lenpat) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
            if (j == lenpat) {
                count++;
                
                j = 0;
            }
        }
        System.out.println(count );
    }

    public static int[] getlps(String pattern) {

        int len = pattern.length();
        int lps[] = new int[len];
        lps[0] = 0;
        int i = 1;
        int j = 0;
        while (i < len) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                lps[i] = j + 1;
                j++;
                i++;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
