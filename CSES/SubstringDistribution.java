import java.util.*;
public class SubstringDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        sc.close();
        HashMap<Integer,HashSet<String>>hm = new HashMap<>();
        allstring(str,hm);

    }
    public static void allstring(String st,HashMap<Integer,HashSet<String>>hm){
        int n = st.length();
        StringBuffer str = new StringBuffer(st);
        for(int i=0; i< n ; i++){
            for(int j = i ;j<=n; j++){
                String s = str.substring(i,j);
                int e = s.length();
                if(!hm.containsKey(e)){
                    HashSet<String>hs = new HashSet<>();
                    hs.add(s);              
                    hm.put(e, hs);
                }
                else{
                    HashSet<String>t = hm.get(e);
                    t.add(s);
                    hm.put(e, t);
                }
            }
        }
        for(int i = 1 ; i< n+1 ; i++){
            int t = hm.get(i).size(); 
                System.out.print(t+" ");
        }
    }
}
