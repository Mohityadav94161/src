import java.util.*;

public class DistinctSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<String>hs = new HashSet<>();
        dsub(str, hs);
        System.out.println(hs.size());
    }

    public static void dsub(String str, HashSet<String> hs) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i +1 ;j<= str.length();  j++) {
                hs.add(str.substring(i, j));
            }
        }
    }
}
