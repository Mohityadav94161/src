package arrayes;
import java.util.*;

public class BeautifulMatrix {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int [][]m = new int [5][5];
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			for(int i = 0;i< 5 ; i++) {
				for(int j = 0; j< 5 ; j++) {
					m[i][j] = sc.nextInt();
					if(m[i][j]==1) {
						a = i;
						b = j;
					}
				}
			}
			if(a>=2){
				c = a-2;
				
			}
			else if(a<2) {
				c = 2-a;
			}
			if(b<2){
				d= 2-b;
				
			}
			else if(b>=2){
				d= b-2;
			}
			  
			System.out.print(c+d);
		}
	}
	
	

}
