package LInkedList;

public class deleteLast {

	public static void main(String[] args) {
		node head = new node(22);
		head.next = new node(88);
		head.next.next= new node(34);
		head.next.next.next = new node(76);
//		print(head);
		head  = deletelas(head);
		print(head);
	}
 public static node deletelas(node head) {
	 node curr = head;
	 while(curr.next.next != null) {
		 curr = curr.next;
	 }
	 curr.next = null;
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
