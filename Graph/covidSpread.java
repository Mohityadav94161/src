import java.util.*;

public class covidSpread {
    public static boolean check(int a,int b, int[][]mat) {
        if(a<0||b<0||a>=mat.length||b>=mat[0].length||mat[a][b]==0){
            return false;
        }
        return true;
    }
    public static int bfs(int[][]mat ,int n ,int m ) {
        int timer = -1;
        Queue<pair>q = new LinkedList<>();
        // pair p  = new pair();
        for(int i = 0; i< n; i++){
            for(int j = 0; j < m ; j++){
                if(mat[i][j] == 0){
                    q.add(new pair(i,j));
                }
            }
        }
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                pair p = q.poll();
                int a = p.i;
                int b = p.j;
                for(int i = -1;i<2;i +=2){
                    if(check(a+i,b,mat)){
                        q.add(new pair(a+i,b));
                        mat[a+i][b] = 0;
                    }
                    if(check(a,b+i,mat)){
                        q.add(new pair(a,b+i));
                        mat[a][b+i] = 0;
                    }
                }


            }
            timer++;
        }
        return timer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int [][]mat = new int[n][m];
            for(int i = 0 ; i< n; i++){
                for(int j = 0; j< m; j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            

            System.out.println(bfs(mat, n ,m));
        }
    }
    static class pair{
        int i;
        int j;
        public pair(int i ,int j){
            this.i = i;
            this.j = j;
        }
        
    }
}
