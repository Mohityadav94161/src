package arrays2;

import java.util.Scanner;

public class jhkjh {

public static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
int count = 0 ;
int count1 = 0 ;
//sc.NextLine();
String s = sc.nextLine();
int i = 0;
for( i = 0 ; i <s.length() ; i++) {
	if(i <=s.length()-3&& s.substring(i,i+1) == "A" && s.substring(i+1, i+2) == "B" && s.substring(i+2,i+3) !="A") {
		 count++; 
		 System.out.println(count);
		 System.out.println(s.substring(i,i+1)+ s.substring(i+1, i+2) +  s.substring(i+2,i+3));
	}
	if(i >=s.length()-3 && s.substring(i,i+1) == "A" && s.substring(i+1, i+2) == "B") {
		count++;
		System.out.println(s.substring(i,i+1)+ s.substring(i+1, i+2) +  s.substring(i+2,i+3));
	}
	if(i >=s.length()-3	&&  s.substring(i,i+1) == "B" && s.substring(i+1, i+2) == "A") {
		count1++;
		System.out.println(s.substring(i,i+1)+ s.substring(i+1, i+2) +  s.substring(i+2,i+3));
	}
	if((i <=s.length()-3 && s.substring(i,i+1) == "B" && s.substring(i+1, i+2) == "A" && s.substring(i+2,i+3) !="B") ) {
		count1++;
		System.out.println(count1);
		System.out.println(s.substring(i,i+1)+ s.substring(i+1, i+2) +  s.substring(i+2,i+3));
	}
}

System.out.println(count);

if(count > 0 &&count1 >0) {
	System.out.println("yes");
}
else {
	System.out.println("no");	
	
}



}

}
