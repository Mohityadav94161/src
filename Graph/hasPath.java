import java.util.LinkedList;
import java.util.Queue;

public class hasPath {
    public static void main(String[] args) {
        
    }

    public boolean is_Possible(int[][] grid)
    {
        // Code here
        int n=grid.length;
        // System.out.println(len);
        Queue<pair> q=new LinkedList<>();
        boolean[][] v=new boolean[n][n];
        int i=0,j=0,f=0;
        for(i=0;i<n;i++){
            for( j=0;j<n;j++){
                if(grid[i][j]==1){
                    f=1;
                    break;
                }
                
            }
            if(f==1){
                    break;
                }
        }
        // System.out.println(i+" "+j);
        
        return helper(grid,v,i,j,n,q);
    }
    
    public boolean helper(int[][] grid,boolean[][] v,int i,int j,int n,Queue<pair> q){
       q.add(new pair(i,j));
       while(q.size()>0){
           pair p=q.remove();
           int a=p.i;
           int b=p.j;
          
           if(a<0||a>=n||b<0||b>=n){
               continue;
           }
        //   System.out.println(a+" "+b+" "+grid[a][b]);
          if(grid[a][b]==0){
              continue;
          }
           if(grid[a][b]==2){
               return true;
           }
           grid[a][b]=0;
           for (int k = -1; k <= 1; k += 2)
            {
                q.add(new pair(a + k, b));
                q.add(new pair(a, b + k));
            }
            // System.out.println(q);
     
        }
       return false;
    }
     
    class pair{
        int i;
        int j;
        pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    } 
    
}

