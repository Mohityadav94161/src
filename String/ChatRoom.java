package String;
import java.util.*;

public class ChatRoom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toLowerCase();
		int h = -1;
		int e = 0;
		int l1 = 0;
		int l2 = 0;
		int o = 0;
		for(int i = 0; i< s.length(); i++) {
			if (s.substring(i,i+1).equals("h")) {
				h = i;
				break;
				
			}
		}
		for(int i = h+1; i< s.length(); i++) {
			if (s.substring(i,i+1).equals("e")) {
				e = i;
				break;
				
			}
		}
		for(int i = e+1; i< s.length(); i++) {
			if (s.substring(i,i+1).equals("l")) {
				l1 = i;
//				System.out.println(l1);
				break;
				
			}
		}
		for(int i = l1+1; i< s.length(); i++) {
			if (s.substring(i,i+1).equals("l")) {
				l2 = i;
//				System.out.println(l2);
				break;
				
			}
		}
		for(int i =l2+1 ; i< s.length(); i++) {
			if (s.substring(i,i+1).equals("o")) {
				o = i;
				break;
				
			}
		}
		if(h!=-1 && e!=0 && l1 !=0 && l2!=0 && o!=0) {
			System.out.println("YES");
			
		}
		else {
			System.out.println("NO");
		}
		

	}

}