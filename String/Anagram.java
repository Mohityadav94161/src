package String;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Anagram {

	

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int i = 0; i<t; i++) {
	        	int n = in.nextInt();
	        	int k = in.nextInt();
	        	String s = in.next();
	        	String input1 = "";
	        	StringBuilder sb=new StringBuilder(s);  
	            sb.reverse();  
	        	input1= sb.toString();
	        	     
	            if (s.equals(input1)|| k==0) {
	            	 System.out.println("yes");
	            		            	
	            }
	             
	            else {
	            	System.out.print("no");
	            	
	            }
	        	
	        }
	       
	    
        }

	
	
}

