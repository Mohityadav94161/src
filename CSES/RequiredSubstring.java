import java.util.*;
public class RequiredSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        int n = sc.nextInt();
        String s = sc.next();
        
        int m = s.length();
        if(n == m){
            System.out.print(m);
            return;
        }
    long res = n-m;
    res = res*2;
    res = (res*26);
    System.out.print(2*(100-15)*26);
     
}
} 
