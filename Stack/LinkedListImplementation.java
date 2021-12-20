package Stack;
 class StackNode
{
    int data;
    StackNode next;
    StackNode(int a)
    {
       data = a;
       next = null;
    }
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		StackNode top =new StackNode(8); 
		pushh(3);
		pushh(5);
		pushh(4);
		pushh(2);
		pushh(1);
		System.out.print("poped item is  " + popp());
		
		

	}
	
	
	
	

	    // Note that top is by default null
	    // in Java
	     static StackNode top = null;
	     static StackNode curr = top;
	     static StackNode POP = null;

	    public static  void pushh(int a) {
	    	StackNode b = new StackNode(a);
//	    	
//	        if(top == null){
//	            top.next.data = a;
//	            curr.next.data = a;
//	        }
	        
	        top.next = b;
	        top = b;
	        
	        System.out.println(top.data);
	        
	    }
	    public static int popp() {
	        if(top == null ||top.next == null){
	            return -1;
	        
	        }
	        else{
	            StackNode  head = curr;
	            while(head.next.next!=null){
	                head = head.next;
	            }
	            POP = head.next;
	            top = head;
	            top.next = null;
	            
	        }
	        return POP.data;
	    
	        
	    }
	}

//}
