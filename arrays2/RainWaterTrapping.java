package arrays2;

public class RainWaterTrapping {

	public static void main(String[] args) {
     int[] arr = {3,0,1,2,5};
     int res = arr[0];
     int sum = 0;
     for(int i = 0; i<arr.length-1;i++) {
    	 if(res>arr[i] && arr[i]<arr[i+1]) {
    		 if(res>arr[i+1]){
    			 sum = sum + arr[i+1]-arr[i];
    		 }
    		 else {
    		 sum = sum +res-arr[i];
    		 }
    		 System.out.println("the sum is "+ sum);
    	 }
    	 else {
    		 res = arr[i];
    		 System.out.println("now res is "+ res);
    	 }
//    	 System.out.println(sum);
     }
     System.out.println("total  ." + sum);

	}

}
