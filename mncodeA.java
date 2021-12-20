import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class mncodeA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long p1 = sc.nextLong();
			long z1 = sc.nextLong();
			long p2 = sc.nextLong();
			long z2 = sc.nextLong();
			ArrayList<Long>s1 = new ArrayList<>();
			ArrayList<Long>s2 = new ArrayList<>();
			Stack<Long>st = new Stack<>();
			int i =0 ;
			while(p1>0) {
				long a = p1%10;
				st.add(a);
				p1 = p1/10;
			}
			while(!st.isEmpty()) {
				s1.add(st.pop());
			}
			i =0;
			while(p2>0) {
				long a = p2%10;
				st.add(a);
				p2 = p2/10;
			}
			while(!st.isEmpty()) {
				s2.add(st.pop());
			}
//			System.out.println(s1);
//			System.out.println(s2);
			boolean flag = true;
			long count1 = s1.size()+z1;
			long count2 = s2.size()+z2;
			if(count1>count2) {
				System.out.println(">");
				continue;
			}
			else if(count1<count2) {
				System.out.println("<");
				continue;
			}
			
			else {
				for(i = 0; i < Math.min(s1.size(),s2.size()) ;i++) {
					if(s1.get(i)>s2.get(i)) {
						System.out.println(">");
						flag = false;
						break;
					}
					else if(s2.get(i)>s1.get(i)) {
						System.out.println("<");
						flag = false;
						break;
					}
				}
	
			}
			
		int diff = 0;
		if(flag) {
			if(s1.size()<s2.size()) {
				diff = s2.size()-s1.size();
				p1 =  (long) (p1*Math.pow(10,diff));
			}
			else {
				diff = s1.size()-s2.size();
				p2 = (long) (p2*Math.pow(10,diff));
			}
			if(p1==p2) {
				System.out.println("=");
			}
			else {
				if(s1.size()>s2.size()) {
					System.out.println(">");
				}
				else {
					System.out.println("<");
				}
			}
		}
			
			
		}

	}

}
