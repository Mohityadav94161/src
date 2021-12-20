package arrays2;

public class Duplicates {
	
	
      public void findDuplicate() {
	    	int[] nums = {1,2,3,4,4};
	        int[] count = new int[nums.length];
	        
	        for( int i = 0; i<nums.length;i++){
	        	
	            count[nums[i]]++;
	        }
	        for(int j = 0;j<count.length;j++){
//	            if(count[j]> 1){
	                System.out.println(count[j]);
	                
//	            }
	        }
	      
	    }
     public void print() {
    	 findDuplicate();
     }
	}


