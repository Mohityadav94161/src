import java.util.*;

public class MinimalRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        StringBuffer s = new StringBuffer(str);
        TreeSet<String>hs = new TreeSet<String>();
        // String e = "ababab";
        
        s = s.append(s);
        for(int i = 0 ; i < n; i++){

           String e=s.substring(i, i+n);
           hs.add(e); 
            // System.out.println(sarr[i]);
        }
        // Arrays.sort(sarr);
        System.out.print(hs.pollFirst());

    }
}
