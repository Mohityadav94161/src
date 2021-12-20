package CircularLinkList;


public class Traversing {

	public static void main(String[] args) {
		node head = new node(11);
		head.next = new node(23);
		head.next.next = new node(87);
		head.next.next.next = new node(45);
		head.next.next.next.next = head;
		print(head);
		
	}
	static void print(node head) {
		node r = head;
		while(r.next.next !=head.next) {
			System.out.println(r.data);
			r =r.next;
		}

	
}
}