package Div2;
import java.util.*;
public class SifidandStrangeSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[]a = new int[n];
            for(int i = 0 ;i < n; i++){
                a[i] = sc.nextInt();
            } 
            int count = 0;
            int res = 0;
            int index = 0;
            ArrayList<Integer>arr = new ArrayList<>();
            Arrays.sort(a);
            for(int i :a){
                if(i<=0){
                    arr.add(i);
                }
            }
            int zero = 0;
            if(arr.size()>0){
                 zero = max(arr, 0);
            }
            // System.out.println("zero case arraylist");
            // System.out.println("array "+ arr);
            if(arr.size()<n){
                arr.add(a[arr.size()]);
            }
            // System.out.println("first case arraylist");
            // System.out.println("array "+ arr);
            count  = max(arr, 0);
            // System.out.println("         count is "+ count);

            if(arr.size()<n){
                arr.add(a[arr.size()]);
            }
            // System.out.println("second case arraylist");
            // System.out.println("array "+ arr);
            res = max(arr, 0);
            // System.out.println("          res is "+res);
            index = Math.max(count,Math.max(res,zero));
            System.out.println(index);

        }
        sc.close();
    }
    public static int max(ArrayList<Integer>arr , int res) {
        int max = arr.get(arr.size()-1);
        // System.out.println(" max in function "+max);
        res = arr.size();
        for(int i  = 1 ; i< arr.size() ; i++){
            if(Math.abs(arr.get(i)-arr.get(i-1))<max){
                // System.out.println(" smaller is found "+ arr.get(i) + " , " + arr.get(i-1)+ " diff "+(arr.get(i)-arr.get(i-1)));
                res--;
                i++;
            }
        }
        return res;
    }
}
