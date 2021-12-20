package LInkedList;

public class InsertAtBegin {

	public static void main(String[] args) {
		node head = new node(11);
		head.next = new node(23);
		head.next.next = new node(87);
		head.next.next.next = new node(45);
		head = add(head,44);
		head = add(head,4);
		head = add(head,94);
		print(head);
		
	}
public static node add(node head,int x ) {
	node temp = new node(x);
	temp.next = head;
	head =temp;
//	System.out.println(head.data);
	return head;

	
}
static void print(node head) {
	node curr = head;
	while(curr != null) {
		System.out.println(curr.data +" ");
		curr = curr.next;
	}
}
}
