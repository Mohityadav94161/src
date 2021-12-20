package Array;

import java.util.ArrayList;

public class Alternate {
	public static void main(String args[]) {
		int arr[] = { 135, 101 ,170 ,125 ,79 ,159 ,163, 65, 106, 146, 82 ,28 ,162 ,92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 
				183, 22, 117, 119, 96, 48, 127, 172, 139, 70 ,113, 68, 100, 36, 95, 104, 12, 123, 134};
		int n = 42 ;
		int s = 468;
//		rearrange( arr,  n);
		
		System.out.print(subarraySum(arr,  n,  s));
		
	}
public static void rearrange(int arr[], int n) {
        ArrayList<Integer>neg = new ArrayList<Integer>();
        ArrayList<Integer>pos = new ArrayList<Integer>();
        int x = 0;
        
        while(x<arr.length){
        	if(n==1||n==0) {
        		System.out.print(arr[0]);
        		return ;
        	}
        	
        else if(arr[x]<0){
                neg.add(arr[x]);
            }
            else{
                pos.add(arr[x]);
            }
            x++;
        }
        int j = 0;
        for(int i = 0; i< arr.length; i++){
            if(i%2 == 0){
                arr[i] = pos.get(j);
                j++;
            } 
            
        }
        j=0;
        for(int i = 0; i< n; i++) {
        	if(i%2 !=0) {
                    
                    arr[i] = neg.get(j);
                    j++;
                    
                
        	}
        }
        for(int i = 0; i< n; i++) {
        	System.out.print(arr[i]+" ");
        }
       
       
       
       
       
    }
public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
    int sum = 0;
    ArrayList<Integer>a = new ArrayList<Integer>();
    int j = 0;
    int t = 0;
    for(int i = 0; i<n ; i++){
        if(sum == s){
          
          return a;
        }
        if(sum < s){
            sum +=arr[t];
            t++;
        }
        if(sum> s && j<i){
            sum -= arr[j];
            j++;
        }
    }
    a.add(-1);
    return a;
   
    
}

}
