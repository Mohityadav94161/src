package String;
import java.util.*;

public class HelpfulMaths {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int []arr = new int[4];
		
		for(int i = 0; i < s1.length(); i++){
			if(i%2==0) {
			
			arr[Integer.parseInt(String.valueOf(s1.charAt(i)))]++;
			}
		}
		String ans = "";
		for(int i = 1; i <4; i++) {
			for(int j = 0; j<arr[i]; j++) {
				ans = ans + i + "+";
			}
			
			}
		
		
         System.out.print(ans.substring(0,ans.length()-1));

	}

}
