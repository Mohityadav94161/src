/**
 * PalindromeReorder
 */
import java.util.*;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        HashMap<Character ,Integer>hmap = new HashMap<>();
        for(int i = 0 ; i< n ; i++){
            if(hmap.containsKey(s.charAt(i))){
                hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
            }
            else{
                hmap.put(s.charAt(i), 1);
            }
        }
        int count = 0 ;
        char odd = '*';
        for(int i = 0 ; i< n ; i++){
            if(hmap.get(s.charAt(i))%2 != 0){
                
                if(s.charAt(i)!=odd){
                    odd = s.charAt(i);
                    count++;
                }
            }
            if(count >1){
                System.out.print("NO SOLUTION");
                return;
            }
        } 
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < n; i++){ 
                int x = hmap.get(s.charAt(i));
                hmap.put(s.charAt(i), 0);
                for(int j = 0; j< x/2 ; j++){
                    str = str.append(s.charAt(i));
                }
            
        }
        StringBuilder temp = new StringBuilder(str);
        StringBuilder res = new StringBuilder(temp.append(str.reverse()));
        if(odd != '*'){
            res.insert(n/2, odd);
        }
        System.out.println(res);
    }
}