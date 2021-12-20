package CircularLinkList;


public class insertAtbeginAndEnd {

	public static void main(String[] args) {
		node head = new node(11);
		head.next = new node(23);
		head.next.next = new node(87);
		head.next.next.next = new node(45);
		head.next.next.next.next = head;
        head = insert(head,1);
        print(head);
	}
	static void print(node head) {
		node curr = head;
		while(curr.next != head) {
			System.out.println(curr.data +" ");
			curr = curr.next;
}			
		}
	static node insert(node head,int y) {
		node curr = head;
		while(curr.next != head) {
			curr = curr.next;
		}
		node temp = new node(y);
		temp.next = head;
		curr.next = temp;
		head = temp; //if not add this then item will e add in the last
		return head;
		
}
	}