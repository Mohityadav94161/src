import java.util.ArrayList;

public class MSTprimsalgo {
    public static void put(ArrayList<ArrayList<Integer>>adj,int v , int u , int mat[][],int weight ) {
        adj.get(v).add(u);
        adj.get(u).add(v);
        mat[v][u] = weight;
        mat[u][v] = weight;
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i =0; i< v ;i++){
            adj.add(new ArrayList<>());
        }
        int [][]mat = new int[v][v];
        int weight[] = new int[v];
        int parent[] = new int[v];
        boolean[] visited = new boolean[v];

        put(adj, 0, 1,mat, 4);
        put(adj, 0, 2,mat, 8);
        put(adj, 1, 2,mat, 2);
        put(adj, 1, 3,mat, 6);
        put(adj, 2, 3,mat, 3);
        put(adj, 2, 4,mat, 9);
        put(adj, 3, 4,mat, 5);
        


        prims( visited, parent, weight, v, mat);
        for(int i = 0 ; i< v; i++){
            if(parent[i]<i){
                System.out.println(parent[i]+ " --> " + i + " = " + weight[i]);
            }
            else{
                System.out.println(i+ " --> " + parent[i] + " = " + weight[i]);
            }
        }

    }



    public static int minvertex(boolean[]visited , int weight[]) {
        int min = -1;
        for(int i = 0 ; i< weight.length;i++){
            if(!visited[i] && (min == -1 || weight[i] < weight[min])){
                min =  i;
            }
        }
        return min;
    }
    public static void prims(boolean []visited,int[]parent,int weight[],int v,int mat[][]) {
        weight[0] = 0;
        parent[0]  = -1;
        for(int i = 1; i< v;i++){
            weight[i] = Integer.MAX_VALUE;
        }
        for(int i = 0 ; i< v; i++){
            int min = minvertex(visited, weight);
            visited[min] = true;
            for(int j = 0 ; j<v ; j++){
                if(mat[min][j] !=0 && mat[min][j]<weight[j] && !visited[j]){
                    
                        weight[j] = mat[min][j];
                        parent[j] = min; 
                    
                    
                }    
            }
        }
    }
}
