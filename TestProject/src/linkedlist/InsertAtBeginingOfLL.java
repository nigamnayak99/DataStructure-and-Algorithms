package linkedlist;

public class InsertAtBeginingOfLL {
	
	public static Node insert(Node head, int data) {
		Node n = new Node(data);
		if(head == null)
			return n;
		n.next = head;
		return n ;
	}

}
