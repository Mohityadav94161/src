import java.util.*;

public class CountingPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        HashMap<String, Integer> hm = new HashMap<>();
        allstring(st, hm);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(hm.containsKey(s)) {
                int t = hm.get(s);
                System.out.println(t);
            } 
            else {
                System.out.println(0);
            }
        }
        sc.close();

    }

    public static HashMap<String, Integer> allstring(String st, HashMap<String, Integer> hm) {
        int n = st.length();
        // String str = new String(st);
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = i; j < n; j++) {
                s = s + st.charAt(j);
                if (!hm.containsKey(s)) {
                    hm.put(s, 1);
                } else {
                    hm.put(s, hm.get(s) + 1);
                }
            }
        }
        return hm;
    }
}
