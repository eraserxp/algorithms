/*
 * implement an algorithm to find the kth to last element of a singly 
 * linked list
 * 
 */
 
public class FindKthToLast {
	
	public static int kthToLast(LinkedListNode ll, int k) {
		LinkedListNode curNode = ll;
		int list_size = findSize(ll);
		// number of jumps to reach the element from the head of the list
		int njump = list_size - k;
		while (njump > 0) {
			curNode = curNode.next;
			njump--;
		}	
		return curNode.data;
	}	
	
	
	// find out the size of the linked list
	public static int findSize(LinkedListNode ll) {
		int counter = 0;
		LinkedListNode curNode = ll;
		while (curNode!=null) {
			curNode = curNode.next;
			counter++;
		}	
		return counter;
	}	
	
	public static void main(String[] args) {
		LinkedListNode ll = new LinkedListNode(10);
		ll.add(9);
		ll.add(8);
		ll.add(7);
		ll.add(6);
		ll.add(5);
		ll.add(4);
		ll.add(3);
		ll.add(2);
		ll.add(1);
		System.out.println("The original linked list is: " );
		ll.print();
		
		for (int i=1; i<=10; ++i) {
			//System.out.printf("The %dth to last element is \n", i);
			System.out.printf("The %dth to last element is %d\n", i, kthToLast(ll, i));
		}
	}	
}	  
