import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<4 && n!=1){
            System.out.print( "NO SOLUTION");
            return;
        }
      for(int i = 2 ; i< n+1;i+=2){
        System.out.print(i+" ");
      }
      for(int i = 1 ; i< n+1;i+=2){
        System.out.print(i+" ");
      }
    }
}
