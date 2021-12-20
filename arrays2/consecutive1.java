package arrays2;

public class consecutive1 {

	public static void main(String[] args) {
	int count = 0;
	int max=0;
	int [] arr = {1};
      for(int i = 0;i<arr.length;i++) {
    	  if(arr[i]==0) {
    		  count = 0 ;
    	  }
    	  
    	  else {
    		  count++;
    		  max = Math.max(max, count) ;
    	 
    	  }
      }
	System.out.println(max);
	}

}
