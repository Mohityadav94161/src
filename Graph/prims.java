package Graph;

import java.util.*;

class prims {
    public static void primes(int[][] matrix) {
        boolean[] visited = new boolean[matrix.length];
        int[] parent = new int[matrix.length];
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
                    if(matrix[minVertex][j] < weight[j]) {
                        weight[j] = matrix[minVertex][j];
                        parent[j] = minVertex;
                    }
                }
            }
        }
        for(int i = 0; i< matrix.length; i++){
            if(parent[i]<i){
                System.out.println(parent[i] + " "+ i+ " "+ weight[i]);
            }
            else{
                System.out.println(i + " "+ parent[i]+ " " + weight[i]);
            }
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
        // Matrix adjancy represntation
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
        primes(matrix);

    }
}