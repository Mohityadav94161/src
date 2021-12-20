package Array;
import java.util.*;
public class pair {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int t = sc.nextInt();
		        while(t>=0){
		            System.out.println("running..."+t);
		            int k = sc.nextInt();
		            int a = sc.nextInt();
		            int b = sc.nextInt();
		            int countzeros = 0 ;
		            int max = 0;
		            int arr[] = new int[a];
		            int brr[] = new int[b];
		            for(int i = 0 ; i< a; i++){
		                arr[i] = sc.nextInt();
		                max = Math.max(max, arr[i]);
		            }
		            for(int i = 0 ; i< b; i++){
		                brr[i] = sc.nextInt();
		                max = Math.max(max, brr[i]);
		            }
		            for(int i = 0 ; i< a; i++){
		                if(arr[i] == 0){
		                    countzeros++;
		                }
		            }
		            for(int i = 0 ; i< b; i++){
		                if(brr[i] == 0){
		                    countzeros++;
		                }
		            }
		            ArrayList<Integer>aa = new ArrayList<>();
		            ArrayList<Integer>bb = new ArrayList<>();
		            for(int i = 0 ; i< a; i++){
		                if(arr[i] != 0){
		                    aa.add(arr[i]);
		                }
		            }
		            for(int i = 0 ; i< b; i++){
		                if(brr[i] != 0){
		                    bb.add(brr[i]);
		                }
		            }
		            if(max>k+countzeros){

		                System.out.print("the answer is " +-1);
		                return;
		            }
		            int q = 0;
		            ArrayList<Integer>res = new ArrayList<>();
		            while(!aa.isEmpty() && q<aa.size()){
		                if(aa.get(q)<=k){
		                    
		                    res.add(aa.get(q));
		                    q++;
		                }
		                else if(aa.get(q)>k){
		                   int r =  aa.get(q)-k;
		                   countzeros =countzeros-r;
		                   k = k+r;
		                   for(int i = 0; i< r; i++){
		                       res.add(0);
		                   } 
		                }

		            }
		            q = 0 ;
		            while(!bb.isEmpty() && q<bb.size()){
		                if(bb.get(q)<=k){
		                    
		                    res.add(bb.get(q));
		                    q++;
		                }
		                else if(bb.get(q)>k){
		                   int r =  bb.get(q)-k;
		                   countzeros =countzeros-r;
		                   k = k+r;
		                   for(int i = 0; i< r; i++){
		                       res.add(0);
		                   } 
		                }
		                
		            }
		            
		            System.out.println("the answer is");
		            for(int i: res){
		                System.out.print(i+" ");
		            }
		            System.out.println();

		            t--;

		        }
		        sc.close();

		    }
		

	}


