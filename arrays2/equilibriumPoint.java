package arrays2;

public class equilibriumPoint {

	public static int main(String[] args) {
		int res = 0;
	    int sum = 0;
	    int []a = {1,223,4,63,3};
	    int n = a.length;
	    for(int i = 0; i<n ; i++){
	        sum += a[i]; 
	    }
	    for(int j = 0 ; j<n ; j++){
	        if(res+a[j] == sum-res-a[j+1]){
	            return j+1;
	        }
	        else{
	            res = res + a[j];
	        }
	    }return -1;
	}

}
