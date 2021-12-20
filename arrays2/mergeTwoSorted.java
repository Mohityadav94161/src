package arrays2;

public class mergeTwoSorted {

	public static void main(String[] args) {
		int [] nums1 = {1,2,4,5,11};
		int [] nums2 = {1,3,9,11};
		int m = nums1.length;
		int n = nums2.length;
		int [] arr = new int[m+n];
	
	      int j = 0;
	      int k = 0; 
	      int l = 0;
	      while(j<m && k<n){
	          if(nums1[j]<=nums2[k]){
	              arr[l]=nums1[j];
	              l++;
	              j++;
	          } 
	        else{
	             arr[l] = nums2[k];
	             
	             l++;
	             k++;
	      }
	         
	          
	    }
//	      System.out.print(arr[l]);
	      while(j<m) {
	    	  arr[l] = nums1[j];
	    	  l++;
	    	  j++;
	    	  
	      }
	      while(k<n) {
	    	  arr[l] = nums2[k];
              l++;
              k++;
	    	  
	      }
          
	      for(int i = 0; i<m+n;i++) {
	    	  System.out.println(arr[i]);
	      }

	}

}
