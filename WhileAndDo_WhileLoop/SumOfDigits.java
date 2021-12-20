package WhileAndDo_WhileLoop;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n>0) {
			int lastDigit = n%10;
			n /= 10;
			sum = sum + lastDigit;
			System.out.println(sum);
		}
		System.out.println(sum);

	}

}
