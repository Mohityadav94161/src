package Div2;
import java.util.Scanner;

public class StrangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            long res = 0 ;

            long[]arr = new long[n];
            long[]crr = new long[n];
            for(int i = 0 ; i< n ; i++){
                arr[i] = sc.nextLong();

                res +=arr[i];
                crr[i] = arr[i];
            }
            boolean is = true;
            
                long i = 0;
                while(is){
                    if(arr[(int)(i%n)]%x != 0){
                        is = false;
                        i++;
                        break;
                    }
                    else{
                        long a = arr[(int)(i%n)]/x;
                        res += crr[(int)(i%crr.length)];
                        arr[(int)i%n] = a;
                        i++;
                    }
                    
                }
            
            
            // for(int e:arr){
            //     System.out.print(e+" ");
            // }
            // for(int e = i; e< arr.size() ; e++){
                
            //         res +=arr.get(e);
                
            // }
            System.out.println(res);
        }
        sc.close();
    }
}
