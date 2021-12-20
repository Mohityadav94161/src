import java.util.*;
public class SubstringOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long n = sc.nextLong();
        sc.close();
        StringBuffer st = new StringBuffer(str);
        TreeSet<String>hs = new TreeSet<>();
        dsub(st, hs);
        for(int i = 0 ; i< n-1 ; i++){
            hs.pollFirst();
        }
        System.out.println(hs.first());
    }
    public static void dsub(StringBuffer str, TreeSet<String> hs) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i +1 ;j<= str.length();  j++) {
                hs.add(str.substring(i, j));
            }
        }
    }
}
