import java.util.*;
public class Div2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-->0) {
			String s = sc.next();
			int l = s.length();
			int count = 0 ;
			for(int i = 0; i < l ; i ++) {
				if(s.charAt(i)=='N')count++;
			}
			if(count==1)System.out.println("no");
			else System.out.println("yes");
		}

	}

}
