package Div2;
import java.util.Scanner;
import java.util.TreeSet;

public class TrashBIN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int g=0;
        while(g++<t){
            
            int n = sc.nextInt();
            long sum = 0L ;
            TreeSet<Integer>ts = new TreeSet<>();
            String s = sc.next();
            for(int i = 0; i< s.length() ;i++){
                if(s.charAt(i) == '1'){
                    ts.add(i);
                }
            }
            for(int i = 0 ; i< n; i++){                   
                    if( ts.ceiling(i)== null){
                        int b = ts.floor(i);
                        sum += Math.abs(i-b);
                    }
                    else if(  ts.floor(i)== null){
                        int b = ts.ceiling(i);

                        sum += Math.abs(b-i);
                    }
                    else{
                        int a = ts.ceiling(i);
                        int b = ts.floor(i);
                        sum += Math.min(Math.abs(i-a),Math.abs(i-b));
                    }
                
            }
            System.out.println("Case #"+ g +": " + sum);
            
        }
        sc.close();
    }
}