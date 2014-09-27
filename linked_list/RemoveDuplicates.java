/*
 * write code to remove duplicates from an unsorted linked list
 * Follow up
 * How would you solve this problem if a temporary buffer is not allowed
 */ 

 
public class RemoveDuplicates {
	
	public static void removeDuplicatesSimple(LinkedListNode ll) {
		while (ll.next!=null) {
			LinkedListNode nodeForComparison = ll.next;
			while (nodeForComparison!=null) {
				// delete the duplicates
				if (nodeForComparison.data == ll.data) {
					if (nodeForComparison.next!=null) { 
						nodeForComparison.next = nodeForComparison.next.next;
					} else { // if it is the end of the linked list
						nodeForComparison = null;
						break; // jump out of the inner while loop
					}	
				}
				nodeForComparison = nodeForComparison.next;	
			}	
			ll = ll.next;
		}	

	}		
	
	public static void main(String[] args) {
		LinkedListNode ll = new LinkedListNode(3);
		ll.add(1);
		ll.add(2);
		ll.add(1);
		ll.add(3);
		ll.add(9);
		ll.add(2);
		System.out.println("The original linked list is: " );
		ll.print();
		removeDuplicatesSimple(ll);
		System.out.println("After deleting duplicates, the linked list is: " );
		ll.print();
	}	
	
}	
