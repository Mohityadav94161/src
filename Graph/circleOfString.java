import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * circleOfString
 */
public class circleOfString {

    public static void main(String[] args) {
        String A[] = { "abc", "bcd", "cdf" };
        HashMap<Character,Integer>first = new HashMap<>();
        HashMap<Character,Integer>last = new HashMap<>();
        for(int i = 0 ; i< A.length ; i++){
            first.put(A[i].charAt(0), i);
            last.put(A[i].charAt(A[i].length()-1), i);
        }
        int i = Integer.MAX_VALUE;
        first.get(key)
    }
}