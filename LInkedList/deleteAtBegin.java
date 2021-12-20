package LInkedList;

public class deleteAtBegin {

	public static void main(String[] args) {
		node head = new node(22);
		head.next = new node(88);
		head.next.next= new node(34);
		head.next.next.next = new node(76);
		head = delete(head);
//		print(head);
		head = delete(head);
		print(head);
	}
public static node delete( node head) {
	head= head.next;
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