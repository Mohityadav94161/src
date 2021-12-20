import java.util.*;
public class TowerOfBharama {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0 ;i< t; i++) {
			long n = sc.nextLong();
			System.out.println(sol(n));
		}
		
    }
	public static long sol(long n) {
		String nums = Long.toString(n);
		int numlength =+ nums.length();
		long reqnum = (numlength-1)*9;
		String dive = "";
		for (int i= 0; i<numlength; i++) {
			dive = dive+1;
		}
		Long req = Long.parseLong(dive);
		long num1 = n/req;
		return num1+reqnum;
	}
	

}
