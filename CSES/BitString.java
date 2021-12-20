package CSES;

import java.util.*;
public class BitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        for(int i = 0 ; i< n ;i++){
            res*=2;
            res = res%(int)(Math.pow(10, 9)+7);
        }
        System.out.print(res);

    }
}
