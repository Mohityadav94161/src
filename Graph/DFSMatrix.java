public class DFSMatrix {
    public static void main(String[] args) {
        //  = new int[7][7];
        boolean[][] visited = new boolean[8][8];
        boolean source = false,dest = false;
        int[][]mat = {
            {3, 3, 3 ,3 ,0 ,0 ,3 ,0},
            {1 ,2 ,3 ,3 ,3 ,3 ,3 ,2},
            {3 ,3, 0, 3 ,0 ,3, 3, 3},
            {3 ,3 ,3 ,0 ,0, 3 ,3 ,0},
            {0 ,3 ,3 ,3 ,3 ,3, 3, 3},
            {0 ,0 ,0 ,3 ,3 ,0 ,3 ,3},
            {0 ,3, 0 ,3 ,3 ,3 ,3 ,0},
            {3 ,3 ,3 ,0 ,3 ,3 ,3 ,3}
       };
        // put(mat,0,1);
        // put(mat,0,2);
        // put(mat,1,3);
        // put(mat,2,3);
        // put(mat,1,4);
        // put(mat,4,5);
        for(int i = 0 ; i< 8; i++){
            System.out.print(Dfs(mat, visited, 0 , source , dest));
        }
    }

// public static void put(int[][]mat, int v , int u) {
//     mat[u][v] = 1;
//     mat[v][u] = 1;
// }

public static boolean Dfs(int[][]mat, boolean visited[][] , int s,boolean source, boolean dest){
    System.out.print(s + " ");
    for(int i = 0 ; i< 8; i++){
        if(mat[s][i] != 0 && !visited[s][i]){
            if(mat[s][i]==1){
                source = true;
            }
            else if(mat[s][i]==2){
                dest = true;
            }
            mat[s][i] = 0;
            visited[s][i] = true;
            Dfs(mat, visited, i , source ,dest);
        }
        
    }
    if(source && dest){
        return true;
    }
    else{
        return false;
    }
    
}



}
