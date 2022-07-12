package linkedlist;

public class ReverseSLL {

	public static Node reverseLinkedListIterative(Node head) {
		if(head == null || head.next == null)
			return head;
		Node previous = head;
		Node current = head.next;
		while(current.next != null) {
			Node next = current.next;
			current.next = previous;
			//update the nodes
			previous = current;
			current = next;
		}
		current.next = previous;
		head.next = null;
		return current;
	}
	
	public static Node reverseLinkedListRecurssively(Node prev,Node curr) {
		//base case
		if(curr.next == null || curr == null) {
			if(prev != null) {
				curr.next = prev;
			}
			return curr;
		}
		//Repeated steps
		Node next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		return reverseLinkedListRecurssively(prev, curr);
	}
}
