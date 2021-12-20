package String;
import java.util.*;


public class PetyaAndString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next().toLowerCase();
	String s2 = sc.next().toLowerCase();
	int s11 = 0;
	int s22 = 0;
	for(int i = 0; i<s1.length(); i++) {
		 s11 =  s1.charAt(i);
		 s22 =  s2.charAt(i);
		  if( s11>s22) {
				System.out.println(1);
				return;
			}
		  else if(s11<s22) {
				System.out.println(-1);
				return;
				
			}
	}
	if(s11 == s22) {
		System.out.println(0);
	}
	}

}
