package Div2;


import java.util.*;
public class PaintTheArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                Long arr[] = new Long[n];
                boolean check = false;
                for(int i = 0 ; i< n ; i++){
                    arr[i] = sc.nextLong();
                    if(i>0 && arr[i]==arr[i-1])check = true;
                }
                if(check == true){
                    System.out.println(0);
                    continue;
                }
                boolean check2 = false;
                for(int i = 0 ; i< n ; i++){
                    check2 = false;
                    for(int j = 0 ; j<n-1; j++){
                        if(arr[i] != 0 && arr[j]%arr[i] == 0 && arr[j+1]%arr[i] == 0){
                            check2 = true;
                           
                            break;
                        }
                        else if( arr[i] != 0 && arr[j]%arr[i] != 0 && arr[j+1]%arr[i] != 0) {
                        	check2= true;
                        	
                        	 break;
                        }
                    }
                    if(check2 == false){
                        System.out.println(arr[i]);
                        break;
                    }
                }
                if(check2 == true) {
                	System.out.println(0);
                }
            }
        }
    }
}
