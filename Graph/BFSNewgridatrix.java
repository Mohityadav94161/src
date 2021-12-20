
import java.util.*;

public class BFSNewgridatrix {
    public static void gridain(String[] args) {
        int [][]grid =  {{3,0,3,0,0},{3,0,0,0,3}
        ,{3,3,3,3,3},{0,2,3,0,0},{3,0,0,1,3}};

        int n = grid.length;
        int i , j  =0;
        int f = 0;
        for(i = 0 ; i< n ;i++){
            for(j = 0 ; j<  n; j++){
                if(grid[i][j] == 1){
                    f = 1;
                    break;
                }
            }
            if(f == 1){
                break;
            }
        }

        boolean v[][] = new boolean[n][n];
        System.out.println(BFS(grid, v, i, j));
        
    }
    public static boolean BFS(int [][]grid,boolean v[][], int a , int b){
        int n = grid.length;
        if(a>=n || b>= n || a<0 || b<0){
            return true;
        }
        if(v[a][b]){
            return true;
        }
        if(grid[a][b] == 0){
            return true;
        }
        return false;
    }
    public static  boolean FS(int[][]grid , boolean[][]v , int i , int j){
        Queue<pair>q = new LinkedList<>();
        q.add(new pair(i,j));
        while(!q.isEmpty()){
            pair p = q.poll();
            int a = p.i;
            int b = p.j;
            if(grid[a][b] == 2){
                return true;
            }
            for(int k = -1 ; k<=1 ;k+=2){

                int xa = a+k;
                int xb  = b+k;
                if(!BFS(grid, v, xa, b)){
                    v[xa][b] = true;
                    q.add(new pair(xa,b));
                }
                if(!BFS(grid, v, a, xb)){
                    v[a][xb] = true;
                    q.add(new pair(a,xb));
                }
            }
        }
        
        
        return false;


    }
    
}
class pair{
    int i , j ;
    public  pair(int i , int j){
        this.i = i;
        this.j = j;
    }
}