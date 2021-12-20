import java.util.ArrayList;

public class MSTprims02 {
    public static void put(ArrayList<ArrayList<Integer>>adj, int u , int  v ,int[][]mat, int w) {
        adj.get(u).add(v);
        adj.get(v).add(u);
        mat[v][u] = w;
        mat[u][v] = w;
    }
    public static void main(String[] args) {
        
        int v = 5;
        int[]weight = new int[v];
        int []parent = new int[v];
        boolean []visited = new boolean[v];
        int mat[][] = new int[v][v];
        ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ; i< v; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i < v; i++){
            weight[i] = Integer.MAX_VALUE;
        }
        weight[1] = 0;
        parent[1] = -1;


        put(adj, 0, 1,mat, 4);
        put(adj, 0, 2,mat, 8);
        put(adj, 1, 2,mat, 2);
        put(adj, 1, 3,mat, 6);
        put(adj, 2, 3,mat, 3);
        put(adj, 2, 4,mat, 9);
        put(adj, 3, 4,mat, 5);
        

        prims(weight, parent, mat, visited, adj);
        for(int i = 0 ; i< v; i++){
            if(parent[i]<i){
                System.out.println(parent[i] + " --> " + i + " = " + weight[i]);
            }
            else{
                System.out.println(i+ " --> " + parent[i] + " = " + weight[i]);
            }
        }
        
    }
    public static void prims(int []weight, int parent[] , int mat[][] , boolean[]visited , ArrayList<ArrayList<Integer>>adj) {
        for(int i = 0 ; i< weight.length ; i++){
            int min = minvertex(weight, visited);
            visited[min] = true;
            for(int e : adj.get(min)){
                if(weight[e] >mat[e][min]+weight[min] && !visited[e]){
                    weight[e] = mat[e][min] + weight[min];
                    parent[e] = min;
                }
            }
        }
    }
    public static int minvertex(int[]weight , boolean[]visited){
        int min = -1;
        for(int i = 0 ; i< weight.length;i++){
            if(!visited[i] && (min == -1 || weight[min]> weight[i])){
                min = i;
            }
        }

        return min;
    }
}

