/*
 * Write code to partition a linked list around a value x, such that all
 * nodes less than x come before all nodes greater than or equal to x
 * 
 */

public class PartitionAround {
	
	// return the head of the new linked list
	public static LinkedListNode partitionAround(LinkedListNode ll, int x) {
		// start from a list with only one node
		LinkedListNode head = ll;
		LinkedListNode tail = ll;
		
		while (ll!=null) {
			LinkedListNode curNode = ll.next;
			if (curNode.data < x) {
				// remove the node from the original list
				ll.next = ll.next.next;
				// prepend the node
				curNode.next = head;
				// update the head
				head = curNode;
			} else {
				// remove the node from the original list
				ll.next = ll.next.next;
				// append the node
				tail.next = curNode;
				// update the tail
				tail = curNode;
				curNode.next = null;
			}
			ll = ll.next;		
		}	
		
		return head; 	
	}	
	
	public static void main(String[] args) {
		LinkedListNode ll = new LinkedListNode(6);
		ll.add(5);
		ll.add(4);
		ll.add(3);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(0);
		System.out.println("The original linked list is: " );
		ll.print();
		
		LinkedListNode x = ll.next.next.next;
		LinkedListNode head = partitionAround(ll, 3);
		System.out.printf("After partitioning around %d, the list becomes:",
		                  x.data);
		head.print();                  
	}	
}	 
