package String;

 public class practise {

	public static void main(String[] args) {
		
		anagram("mpohit","pmohghit");
		
		
}
      static  boolean anagram( String s1,String s2) {
    	  if (s1.length() != s2.length()) {
    		  return false;
    		  }
    	  int count[] = new int[256];
    	  for(int i = 0; i<s1.length();i++) {
    		  count[s1.charAt(i)]++;
    		  System.out.println(count[i]);
    	  }
    	  for(int i=0; i<s2.length();i++) {
    		  count[s2.charAt(i)]--;
    	  }
//    	  for(int i = 0; i<256;) {
//    		  if (count[i] !=0) {
//    			  System.out.println("false");
//    			  return false;
//    			  }
//    		  else {
//    			  System.out.println("true");
//    			  return true;
    		  
    	  
    	  
    	  return true;
    	   
      }
}