package Graph;

public class AdajencyList {
    public static void main(String[] args) {
        
        int mat[][] = new int[4][4];
        put(mat, 1, 2);
        put(mat, 3, 2);
        put(mat, 1, 3);
        for(int i = 0 ; i< 4 ; i++){
            for(int j = 0 ; j< 4; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void  put(int mat[][] ,int v, int u) {
         mat[v][u] = 1;
         mat[u][v] = 1; 
    }

}
