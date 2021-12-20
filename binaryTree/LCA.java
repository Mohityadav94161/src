package binaryTree;
import java.util.*;

public class LCA {

	public static void main(String[] args) {
		
		lca(3552 ,3801);
	}
	 static int lca (int a, int b){
	        ArrayList<Integer>arr1 = new ArrayList<>();
	        ArrayList<Integer>arr2 = new ArrayList<>();
	       
	        int[]arr2arr1  = {9995, 7407, 4246, 3481, 3786, 3709, 3564, 3516, 3549, 3554, 3552};
	        int []arr22 = {9995, 7407, 4246, 3481, 3786, 4214, 3873, 3841, 3821, 3795, 3809, 3805, 3801};
	        for(int i:arr2arr1) {
	        	arr1.add(i);
	        }
	        for(int i:arr22) {
	        	arr2.add(i);
	        }
	        int index = 0;
	        System.out.println("a "+a);
	        System.out.println("b "+b);
	        for(int i = 1 ; i< Math.min(arr1.size() ,arr2.size()) ;i++){
	            if(arr1.get(i) != arr2.get(i)){
	                System.out.println("arr1 " +arr1.get(i) +" not equal to "+arr2.get(i));
	                System.out.println("index1 is "+(i-1));
	                index = i-1;
	                break;
	            }
	            else if( i ==Math.min(arr1.size() ,arr2.size())-1 ){
	                System.out.println("index2 is "+i);
	                index = i;
	            }
	        }
	        System.out.println("arr1 "+arr1);
	        System.out.println("arr2 "+arr2);
	        System.out.println("index "+index);
	        int res = arr1.size()-index-1;
	        System.out.println("res1 "+res);
	        res += arr2.size()-index-1;
	        System.out.println("res2 "+res);
	        
	        
	        return res;
	        
	    }

}
