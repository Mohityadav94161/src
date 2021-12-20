import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class AlienDictionary {
    public static void main(String[] args) {
        
        int i = 0;
    }

    static String alien(HashMap<Character , HashSet<Character>>graph , String[]str ){
        HashMap<Character , Integer>indeg = new HashMap<>();

        for(int i =0 ; i< str.length-1 ; i++){
            char[]ch1 = str[i].toCharArray();
            char[]ch2 = str[i+1].toCharArray();
            for(int j = 0 ; j<Math.min(ch1.length, ch2.length) ; j++){
                if(ch1[i] != ch2[i]){
                    if(indeg.containsKey(ch2[i])){
                        indeg.put(ch2[i], indeg.get(ch2[i])+1);
                    }
                    else if(!indeg.containsKey(ch2[i])){
                        indeg.put(ch2[i], 1);
                    }
                    if(graph.containsKey(ch1[i]) && !graph.get(ch1[i]).contains(ch2[i])){
                        graph.get(ch1[i]).add(ch2[i]);
                    }
                    else if(!graph.containsKey(ch1[i])){
                        HashSet<Character>hs = new HashSet<>();
                        hs.add(ch2[i]);
                        graph.put(ch1[i],hs);
                    }
                }
            }
        }
        String ans = topo(graph,indeg );
        return ans;
    } 
    static String topo(HashMap<Character , HashSet<Character>>graph , HashMap<Character , Integer>indeg){
        String s = "";
        Queue<Character>q = new LinkedList<>();
        for(char ch : indeg.keySet()){
            if(indeg.get(ch)==0){
                q.add(ch);
            }   
        }
        int count = 0 ;
        while(!q.isEmpty()){
            int size = q.size();
            
            while(size-->0){
                char rem = q.poll();
                s+=rem;
                if(graph.containsKey(rem)){
                    HashSet<Character>nbrs = graph.get(rem); 
                    for(char c:nbrs){
                        indeg.put(c, indeg.get(c)-1);
                        if(indeg.get(c)==0){
                            q.add(c);
                        }
                    }
                }
            }
        }
        if(count == indeg.size()){
            return s;
        }
        else{
            return "";
        }

    } 
}
