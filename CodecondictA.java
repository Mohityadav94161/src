import java.util.*;
public class CodecondictA {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     String str= sc.next();
	      
	     PriorityQueue<Integer>pq = new PriorityQueue<>();
	     HashSet<Integer>hs = new HashSet<>();
	     permute(str ,0 ,str.length()-1 ,hs);
	     for(int i:hs) {
	    	 pq.add(i);
	     }
	     while(!pq.isEmpty()) {
	    	 System.out.println(pq.poll());
	     }
	       
		
	}
	public static void permute(String str, int l, int r ,HashSet<Integer>hs)
    {
        if (l == r) {
        	hs.add(Integer.valueOf(str));
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r, hs);
                str = swap(str,l,i);
            }
        }
    }
	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
