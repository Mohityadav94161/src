package Div2;

import java.util.Scanner;

public class ABBB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            
            int st = 0;
            for(int i = 0 ; i< s.length() ; i++){
                if(st != 0 && s.charAt(i)=='B'){
                    st--;
                }
                else{
                    st++;
                }
            }
            System.out.println(st);
        }
        sc.close();
    }
}
