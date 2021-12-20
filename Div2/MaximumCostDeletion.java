package Div2;
import java.util.Scanner;

public class MaximumCostDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
       
        // System.out.println("n "+ n);
        // int c = 0;
        while(n>0){
            // System.out.println("Running " + c++);




            
        
            int a = sc.nextInt();
            int b = sc.nextInt();
            String s = sc.next();
            // int zero = 0;
            // int one = 0;
            int count = 1 ;
            // ArrayList<Integer>arr = new ArrayList<>();
            for(int i = 1 ; i < s.length(); i++){
                if(s.charAt(i) != s.charAt(i-1)){
                    count++;
                }
                
            }
            count = count/2+1;
            // for(int i:arr){
            //     zero += i; 
            // }
            // one = s.length()-zero;
            // int ans = 0 ;
            // for(int i: arr){
            //     // System.out.println("i is "+ i);
            //     ans += a*i + b;
            // }
            // // System.out.println("anns is "+ ans);
            // if(one != 0){
            //     ans += a*one + b;
            // }

            int ans = a*s.length() + b*count;
            if(ans<s.length()*(a+b)){
                System.out.println(s.length()*(a+b));
            }
            else{
                System.out.println(ans);
            }
            // if(a<= 0 && b>=0){
            //     System.out.println(s.length()*(a+b));
                
            // }
            // else if(a<0 && b< 0){
            //     if(a == -1){
            //         System.out.println(s.length()*(a+b));
            
            //     }
            //     System.out.println(ans);
                
            // }
            // else{
            //     System.out.println(ans);
            // } 
            n--;
            
    }
    sc.close();

        
    }
}
