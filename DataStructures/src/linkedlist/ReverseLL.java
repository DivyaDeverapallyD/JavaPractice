package linkedlist;

/*1->2->3->4
 * 4->3->2->1
 * 
 * */
public class ReverseLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list= new LinkedList();
		list.addData(list, 1);
		list.addData(list, 2);
		list.addData(list, 3);
		list.addData(list, 4);
		//list.printList(list);
		
		LinkedList reverserList=reverseList(list);
		System.out.println("reversing");
		//reverseList(list);
		list.printList(reverserList);
		
	}

	/**
	 * @param list
	 * @return
	 */
	private static LinkedList reverseList(LinkedList list) {
		// TODO Auto-generated method stub
		
		Node curr=list.head;
		Node nex=null;
		Node  prev=null;
		while(curr!=null)
		{
			nex=curr.next;
			curr.next=prev;
			prev=curr;
			curr=nex;
			
		}
		list.head=prev;
		/*LinkedList list1= new LinkedList();
		list1.printList(list);*/
		return list;
	}

}
