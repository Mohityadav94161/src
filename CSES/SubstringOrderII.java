import java.util.*;
public class SubstringOrderII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long n = sc.nextLong();
        sc.close();
        StringBuffer st = new StringBuffer(str);
        PriorityQueue<String> hs = new PriorityQueue<>();
        dsub(st, hs);
        for (int i = 0; i < n - 1; i++) {
            hs.poll();
        }
        System.out.println(hs.poll());
    }

    public static void dsub(StringBuffer str, PriorityQueue<String> hs) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                hs.add(str.substring(i, j));
            }
        }
    }

}
