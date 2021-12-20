package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		String []str = {"adf" ,"adf" , "ddf"};
		HashMap<Integer,ArrayList> mp = new HashMap<Integer,ArrayList>();
        List<List<String>>res = new ArrayList<List<String>>();
        int n = str.length;
        int a[]  = new int[n];
        for(int i = 0 ; i< n ; i++){
            int x = 0;
            for(int j = 0; j <str[i].length(); j++){
                 x += str[i].charAt(j);
            }
            String word = str[i];
            if(mp.containsKey(x)){
                mp.get(x).add(word);
            }
            else{
                ArrayList<String>arr = new ArrayList<>();
                arr.add(word);
                mp.put(x,arr);
            }
            
        }
        for(int e : mp.keySet()){
            ArrayList<String> values = mp.get(e);
            System.out.println(values);
        }

	}

}
