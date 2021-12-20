import java.util.*;

public class TwoSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int sum = n*(n+1)/2;
        if(sum%2 != 0){
            System.out.print("No");
            return ;
        }
        int res = 0;
        // ArrayList<Integer>arr1=  new ArrayList<>();
        int left = 0;
        int right = n;
        while(left<right){
            if(res<sum/2){
                res += left;
                left++;
            }
            // else if(res>)
        }
    }
}