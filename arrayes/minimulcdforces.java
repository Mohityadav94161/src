package Array;
import java.util.*;
public class minimulcdforces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			
			int n = sc.nextInt();
			ArrayList<Integer>arr = new ArrayList<>();
			TreeSet<Integer>tree = new TreeSet<>();
			for(int i = 0 ; i< n ; i++) {
				arr.add(sc.nextInt());
				tree.add(arr.get(i));
			}
			if(n == 1) {
				System.out.println(arr.get(0));
				continue;
			}
//			int size = n;
			int res = -100000;
			for(int i = 0 ; i< n ; i++) {
				int a = 0;
				if(tree.size()>0) {
					a = tree.pollFirst();
					tree.remove(a);
					System.out.println("here "+i);
				
				}
				System.out.println("tree size "+ tree.size());
				int size = tree.size();
				for(int iii =0  ;iii< size ; iii++){
					int ii = tree.first();
					tree.remove(tree.first());
					ii -=a;
					tree.add(ii);
				}
				System.out.println("tree ");
				for(int iii : tree) {
					System.out.print(iii+" ");
				}
				System.out.println();
			}
			System.out.println(res);
			
		}

	}

}
