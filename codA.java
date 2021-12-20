import java.util.Scanner;

public class codA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tt = sc.nextInt();
		while(tt-->0) {
			int aa = sc.nextInt();
			
			if(aa%2 ==0) {
				System.out.println(0);
				continue;
			}
			
			
			String s=Integer.toString(aa);
			if(valided(s.charAt(0))){
				System.out.println(1);
				continue;
			}
			for(int i =0  ; i<100 ;i++ ) {
				int sdkdkj =i;
			}
            for(int i =0  ; i<100 ;i++ ) {
				int sdkg = i+i;
			}
			boolean flag = true;
			   for(int i =1  ;i< s.length()-1; i++) {
				  if(valided(s.charAt(i))) {
					 System.out.println(2);
					 flag = false;
					 break;
				   }
				 
			   }
			
				
			if(flag)	System.out.println(-1);
		}

	}
	public static boolean valided(char d) {
		if(d=='2'||d=='4'||d=='6'||d=='8'||d=='0') {
			return true;
		}
		else return false;
	}

}
