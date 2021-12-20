
package Div2;
import java.util.*;

public class SmallString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String smstr = sc.next();
        String str = sc.next();
        sc.close();
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int a = 0; a < smstr.length(); a++) {
            if (!hm1.containsKey(smstr.charAt(a))) {
                hm1.put(smstr.charAt(a), 1);
            } else {
                hm1.put(smstr.charAt(a), hm1.get(smstr.charAt(a)) + 1);
            }
        }

        int i = 0, j = 0, count = 0;
        int fi = 0, fj = 0;
        int res = Integer.MAX_VALUE;
        while (count < smstr.length()) {
            if (!hm2.containsKey(str.charAt(j))) {
                if (hm1.containsKey(str.charAt(j))) {
                    count++;
                }
                hm2.put(str.charAt(j), 1);

            } else {
                if (hm1.containsKey(str.charAt(j)) && hm1.get(str.charAt(j)) > hm2.get(str.charAt(j))) {
                    count++;
                }
                hm2.put(str.charAt(j), hm2.get(str.charAt(j)) + 1);
            }
            j++;
        }

        while (j < str.length() && i < j) {
            if (res > (j - i)) {
                res = j - i;
                fi = i;
                fj = j;
            }

            if (count < smstr.length()) {
                if (!hm2.containsKey(str.charAt(j))) {
                    if (hm1.containsKey(str.charAt(j))) {
                        count++;
                    }
                    hm2.put(str.charAt(j), 1);
                } else {
                    if (hm1.containsKey(str.charAt(j)) && hm1.get(str.charAt(j)) > hm2.get(str.charAt(j))) {
                        count++;
                    }
                    hm2.put(str.charAt(j), hm2.get(str.charAt(j)) + 1);
                }
                j++;
            }

            else if (hm1.containsKey(str.charAt(j)) && hm1.get(str.charAt(j)) < hm2.get(str.charAt(j))) {
                hm2.put(str.charAt(i), hm2.get(str.charAt(i)) - 1);
                i++;
            }

            else if (!hm1.containsKey(str.charAt(i))) {
                if (hm2.get(str.charAt(i)) == 1) {
                    hm2.remove(str.charAt(i));
                    i++;
                } else {
                    hm2.put(str.charAt(i), hm2.get(str.charAt(i)) - 1);
                    i++;
                }
            }

            else {
                hm2.put(str.charAt(i), hm2.get(str.charAt(i)) - 1);
                i++;
                count--;
            }

        }

        System.out.println(str.substring(fi, fj + 1));

    }
}
