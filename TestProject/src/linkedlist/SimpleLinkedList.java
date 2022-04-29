package linkedlist;

public class SimpleLinkedList {
	
	public static void main(String[] args) {
		Node head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);
		head.next = first;
		first.next = second;
		print(head);
		printRecurssively(head);
	}
	
	
	//Traverse Linked List Iteratively
	public static void print(Node head) {
		if(head != null) {
			do {
				System.out.print(head.data+" ");
				head = head.next;
			}
			while(head != null);
		}
	}
	
	//Traverse Linked List Recursively
	public static void printRecurssively(Node head) {
		if(head == null)
			return;
		System.out.print(head.data+" ");
		printRecurssively(head.next);
	}
	
	
}