package arrays2;
import java.util.*;

public class codefor1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			long aa = sc.nextLong();
			long bb = sc.nextLong();
			long xx = aa*(bb-1);
			long yy = aa;
			long z = aa*bb;
			if(bb ==1) {
				System.out.println("NO");
			
			}
			else if(bb ==2) {
				xx = 3*aa;
				yy = aa;
				z = 4*aa;
				System.out.println("YES");
				System.out.println(xx + " " + yy + " " + z );
			}
			else {
				System.out.println("YES");
				System.out.println(xx + " " + yy + " " + z );
			}
		}
	}

}
