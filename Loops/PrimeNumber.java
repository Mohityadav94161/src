package Loops;

public class PrimeNumber {

	public static void main(String[] args) {
		int prime = 342;
		
		boolean flag =false;
		for(int i=2;i*i<prime;i++) {
			 if(prime%i==0) {
				flag=true;
			} 
		}
		if(flag==true) {
			System.out.println(prime + " not a prime number");
		}else {
			System.out.println(prime + " a prime number");
		}
		}

}


