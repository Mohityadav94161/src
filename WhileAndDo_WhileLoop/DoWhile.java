package WhileAndDo_WhileLoop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i =1;
		do { i = sc.nextInt();
		i = i--;
		System.out.println("number"+i);
		
		}
        while(i==0);
	}

}
