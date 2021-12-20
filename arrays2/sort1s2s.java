package arrays2;
import java.util.Scanner;


public class sort1s2s {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int h = s.nextInt();
		int m = s.nextInt();
		
		if(image(h)>90) {
			System.out.println("the value of image h0 is   .." + image(h));
			System.out.print(00 +":"+00);
		}
		else if(image(m)> 80) {
			System.out.println("the value of image h is   .." + image(h));
			System.out.print(image(h+1) + ":" + 00);
		}
		else {
			System.out.println("the value of image h2 is   .." + image(h));
			System.out.print(image(h) + ":" + image(m));
		}
	
	}public static int image(int n) {
		int a = 0;
		int r,n1 = 0;
		while (n != 0) {
		     
			 r =  n%10;
			 n = n/10;
			 if(r == 2  ) {
				 r = 5;
			 }
			 else if(r==3 ||r==4 || r==5) {
				 r = 2;
			 }
			 else if(r == 6 || r== 7|| r==8 ) {
				 r = 8;
			 }
			 else if(r == 9 || r==0) {
				 r = 0;
			 }
//			 System.out.println("the value of a when r is :" + r +"tne a is : "+a );
			 n1 = n1*10 +r;
			
		}
//		 System.out.print(n1);
		return n1;
	}

}
