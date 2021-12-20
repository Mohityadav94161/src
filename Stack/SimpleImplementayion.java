package Stack;
import java.io.*;

import java.util.Scanner;
import java.util.Stack;


public class SimpleImplementayion {

	public static void main(String[] args) {
		 System.out.print(isBalanced());
		
		
	}	
public static boolean isBalanced() {
	Stack<String>s = new Stack<String>();
	Scanner sc = new Scanner(System.in);
	String str11 = sc.next();
	
     for(int i=0; i<str11.length();i++) {
    	 if (str11.substring(i, i+1).equals("(")||str11.substring(i, i+1).equals("[")||str11.substring(i, i+1).equals("{")) {
    		s.push(str11.substring(i, i+1));
    		System.out.print(str11.substring(i, i+1));
    	 }
    	 else if( s.isEmpty()==false &&  
    			 (str11.substring(i, i+1).equals(")") && s.peek().equals("(") ||
    			  str11.substring(i, i+1).equals("]") && s.peek().equals("[") ||
    			  str11.substring(i, i+1).equals("}") && s.peek().equals("{"))
    			  ) {
    		 s.pop();
    	 }
    	 else if(s.isEmpty()== true && (str11.substring(i, i+1).equals(")")||str11.substring(i, i+1).equals("}")||str11.substring(i, i+1).equals("]"))){
    		 return false;
    	 }
    	 else {
    		 return false;
    	 }
    	 
    	 }
     

	   return (s.empty());
	
}



}
