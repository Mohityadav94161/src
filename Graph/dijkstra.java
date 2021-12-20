package Graph;

import java.util.Scanner;

public class dijkstra {
	public static void dikst(int[][]matrix) {
		 boolean[] visited = new boolean[matrix.length];
	        
	        int[] weight = new int[matrix.length];
	        weight[0] = 0;
	        for (int i = 1; i < matrix.length; i++) {
	            weight[i] = Integer.MAX_VALUE;
	        }
	        for (int i = 0; i < matrix.length; i++) {
	            int minVertex = findmin(weight, visited);
	            visited[minVertex] = true;

	            for (int j = 0; j < matrix.length; j++) {
	                if (!visited[j] && matrix[minVertex][j] != 0) {
	                    if(matrix[minVertex][j]+weight[minVertex] < weight[j]) {
	                        weight[j] = matrix[minVertex][j] + weight[minVertex];
	                        
	                    }
	                }
	            }
	        }
//	        print
	        for(int i = 0; i< matrix.length; i++){
	        	System.out.println(i +" "+ weight[i]);
	            
	           
	        }

	    }


	    public static int findmin(int[] weighted, boolean[] visiteds) {
	        int min = -1;
	        for (int i = 0; i < weighted.length; i++) {
	            if (!visiteds[i] && (min == -1 || weighted[i] < weighted[min])) {
	                min = i;
	            }
	        }
	        return min;

	    }

	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int V = sc.nextInt();
	        int E = sc.nextInt();
	        int[][] matrix = new int[V][V];
	        for (int i = 0; i < E; i++) {
	            int beg = sc.nextInt();
	            int end = sc.nextInt();
	            int weight = sc.nextInt();

	            matrix[beg][end] = weight;
	            matrix[end][beg] = weight;
	        }
	        dikst(matrix);

	    }

	

}
