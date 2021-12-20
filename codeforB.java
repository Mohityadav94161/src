import java.util.*;
public class codeforB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			long c =0;
		    c = (a+b)/4;
		    if(Math.min(a,b)>=c){
		            System.out.println(c);
		    }else{
		         System.out.println(Math.min(a,Math.min(b,c)));
		    }
			
		}

	}

}
