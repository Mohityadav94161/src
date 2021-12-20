package Div2;

import java.util.*;
public class AddAndDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.close();

            int count = 0;
            while(a>0){
                a = a/b;
                count++;
                if(a>b){
                    b = b+1;
                    count++;
                }
                else if(a<b){
                
                }
                
            }
            
            System.out.println("the " +count);
        }
    }
}
