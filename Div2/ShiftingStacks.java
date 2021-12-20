package Div2;

import java.util.Scanner;

public class ShiftingStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            sc.close();
            boolean flag = true;
            
            long sum1 = 0 ;
            for(int i = 0 ;i < n ;i++){
                long a = sc.nextLong();
                long sum2 = i*(i+1)/2;
                sum1 +=a;
                
                if( sum1<sum2){
                    flag = false;
                }
                
                
            }
            if(flag == false){
                System.out.println("no");
            }
            else if(n==1||n==0){
                System.out.println("yes");
            }
            else if(flag == true){
                System.out.println("yes");
            }
            
            
            
        }
    }
}
