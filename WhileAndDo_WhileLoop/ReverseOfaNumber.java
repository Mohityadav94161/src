package WhileAndDo_WhileLoop;
import java.util.Scanner;

public class ReverseOfaNumber {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int reverse = 0;
int i = n;

while(i>0) {
	int lastDigit = i%10;
	i = i/10;
	reverse = reverse*10 + lastDigit;
	
}
	if(reverse == n) {
		System.out.println("The "+n+" the "+reverse + " is palindrome");
	}
	else {
		System.out.println("The "+n+" the " +reverse+ " is not a palindrome");
	}
}

	}


