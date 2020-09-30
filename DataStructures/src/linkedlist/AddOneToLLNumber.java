package linkedlist;

/*Number is represented in linked list such that each digit corresponds to a node in linked list. Add 1 to it.
 *  For example 1999 is represented as (1-> 9-> 9 -> 9) and adding 1 to it should change it to (2->0->0->0)*/
public class AddOneToLLNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addData(list, 1);
		list.addData(list, 9);
		list.addData(list, 9);
		list.addData(list, 9);
		// LinkedList.addData(15);
		list.printList(list);

		String number = "";
		Node temp = list.head;
		while (temp != null) {
			number += temp.data;
			temp = temp.next;

		}
		
		String str = String.valueOf(Integer.parseInt(number) + 1);

		LinkedList list1 = new LinkedList();
		for (int i = 0; i < str.length(); i++) {
			System.out.println("hai" + str.charAt(i));
			list1.addData(list1, Integer.parseInt(String.valueOf(str.charAt(i))));
		}

		list.printList(list1);
	}

}
