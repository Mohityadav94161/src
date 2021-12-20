import java.util.*;
public class BellmanFord {
    public static void put(ArrayList<ArrayList<Integer>>adj,int v , int u , int mat[][],int weight ) {
        adj.get(v).add(u);
        adj.get(u).add(v);
        mat[v][u] = weight;
        mat[u][v] = weight;
    }

    public static void main(String[] args) {
        

        int v = 4;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i =0; i< v ;i++){
            adj.add(new ArrayList<>());
        }
        int [][]mat = new int[v][v];
        int weight[] = new int[v];
        // int parent[] = new int[v];
        // boolean[] visited = new boolean[v];

        put(adj, 0, 1,mat, 1);
        put(adj, 0, 2,mat, 4);
        put(adj, 1, 2,mat, -3);
        put(adj, 1, 3,mat, 2);
        put(adj, 2, 3,mat, 3);
        
        
        for(int i = 0 ; i< v; i++){
            weight[i] =  Integer.MAX_VALUE;
        }
        weight[0] = 0;
        BMF(adj, 0, v, weight, mat);

        for(int i = 0 ; i< v; i++){
           
                System.out.println( weight[i]);
            
        }


    }
    public static void BMF(ArrayList<ArrayList<Integer>>adj, int s , int v, int weight[], int[][]mat) {
        for(int i = 0 ; i< v; i++){
            for(int e :adj.get(i)){
                if (weight[e]>weight[i]+mat[i][e] && weight[i] != Integer.MAX_VALUE) {
                    weight[e] = weight[i] + mat[i][e];
                }
            }
            for(int e: adj.get(i)){
                if (weight[e]>weight[i]+mat[i][e]) {
                   System.out.print(" Negative weight path found " + i + " to " + e);
                }
            }
        }
        
        
    }

}
