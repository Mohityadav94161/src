import java.util.*;
public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long max = 0;
        char ch = s.charAt(0);
        long m = 1 ;
        for(int i = 1 ; i< s.length() ; i++){
           if(s.charAt(i) == ch){
            m++;
            max = Math.max(max, m);
           }
           else{
            
               m=1;
               ch = s.charAt(i);
           }

        }
        max = Math.max(max, m);
        System.out.print(max);
    }
}
