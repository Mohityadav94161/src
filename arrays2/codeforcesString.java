package arrays2;
import java.util.*;

public class codeforcesString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			String strs = s.next();
			char[] ar = strs.toCharArray();
 
			HashMap<Character, Integer> h = new HashMap<Character, Integer>();
			for (int i = 0; i < n; i++) {
				char chs = ar[i];
				if (h.containsKey(chs)) {
					int counts = h.get(chs) + 1;
					h.put(chs, counts);
				} else {
					h.put(chs, 1);
				}
			}
			boolean anss = true;
			int counts = h.get(ar[0]) - 1;
			h.put(ar[0], counts);
			for (int i = 1; i < n; i++) {
				if (ar[i] == ar[i - 1]) {
					int count11 = h.get(ar[i]) - 1;
					h.put(ar[i], count11);
				} else {
					int c11 = h.get(ar[i - 1]);
					if (c11 != 0) {
						anss = false;
						break;
					} else {
						int count22 = h.get(ar[i]) - 1;
						h.put(ar[i], count22);
					}
				}
			}
			if (anss == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
 
		}
 
		
	}

}
