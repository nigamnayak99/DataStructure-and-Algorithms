package linkedlist;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SimpleLinkedList sl = new SimpleLinkedList();
		
		Node head = new Node(10);
		Node first = new Node(15);
		Node second = new Node(20);
		Node third = new Node(25);
		head.next = first;
		first.next = second;
		second.next = third;
		
		//Insert At Begining 
//		InsertAtBeginingOfLL ins = new InsertAtBeginingOfLL();
//		
//		head = ins.insert(head, 5);
//		head = ins.insert(head, 100);
//		sl.printRecurssively(head);
		
		
		//Delete FirstNode 
//		DeleteFirstNodeSLL dlf = new DeleteFirstNodeSLL();
//		head = dlf.deleteFirstNode(head);
//		sl.print(head);
		
//		//Delete Last Node
//		DeleteLastNodeSLL dls = new DeleteLastNodeSLL();
//		head = dls.deleteLastNode(head);
//		sl.print(head);
		
		//Reverse linkedList
//		ReverseSLL rev = new ReverseSLL();
//		head = rev.reverseLinkedListIterative(head);
//		sl.printRecurssively(head);
		
//		ReverseSLL r = new ReverseSLL();
//		head = r.reverseLinkedListRecurssively(null,head);
//		sl.printRecurssively(head);
		
//		InsertAtAGivenPositionSLL ins = new InsertAtAGivenPositionSLL();
//		head = ins.insertNode(third, 8, 1);
//		sl.print(head);
		
//		InsertAtTheEndSLL ine = new InsertAtTheEndSLL();
//		head = ine.insertAtTheEnd(null, 100);
//		sl.print(head);
		

	}

}
