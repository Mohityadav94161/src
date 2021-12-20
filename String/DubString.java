package String;
import java.util.*;

public class DubString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = "" ;
		for(int i = 0; i< s.length(); i++) {
			if(i<= s.length()-3&& s.substring(i,i+1).equals("W")&&s.substring(i+1,i+2).equals("U")&&s.substring(i+2,i+3).equals("B")) {
				if(i <= s.length()-2)
				i+=2;
				if(s1.isEmpty()==false) {
				s1 = s1 + " ";
				}
			}
			else {
				s1  = s1 + s.substring(i,i+1);
				
			}
//			if(i == s.length()-1 && !s.substring(s.length()-1).equals("B")) {
//				s1 = s1 + " " + s.substring(s.length()-3,s.length());
//			}
			
			
		}
		System.out.print(s1);
		

	}

}
