import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int count = 0;
            while(a>0){
            	if(b < a-b || b==1){
                    b = b+1;
                    count++;
                    System.out.println("b++ count++ "+ count + "  a is " + a);
                }
                a = a/b;
                count++;
                System.out.println("count++ "+ count + "  a is " + a);
                if(a==b) {
                	count+= 2;
                	a=0;
                	System.out.println(" a==b count+2 "+ count + "  a is " + a);
                }
                
                
                
            }
            System.out.println("the " +count);
        }

	}

}
