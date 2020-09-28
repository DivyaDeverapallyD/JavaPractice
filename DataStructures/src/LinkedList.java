import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Node {

	Node next;
	int data;

	Node(int data) {
		this.data = data;

	}

}

public class LinkedList {
	public static Node head;

	public void addData(LinkedList list, int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	public static void printList(LinkedList list) {
		// Iterator it=((Object) list).iterator();
		Node temp = list.head;
		while (temp != null) {
			System.out.print(temp.data + "----");
			temp = temp.next;
		}
		System.out.println("");
	}

	public static void main(String... strings) {
		System.out.println("Hellooooo");
		LinkedList list = new LinkedList();
		list.addData(list, 2);
		list.addData(list, 4);
		list.addData(list, 24);
		System.out.println("Inserting");
		printList(list);

		remove(4);
		System.out.println("");
		System.out.println("Deleting");
		printList(list);
		System.out.println("Deleting 2");
		remove(2);
		printList(list);
		System.out.println("Inserting");
		list.addData(list, 12);
		list.addData(list, 42);
		list.addData(list, 25);
		printList(list);

	}

	public static void remove(int i) {
		// TODO Auto-generated method stub

		Node temp = head;
		if (head.data == i) {
			head = head.next;
		} else {
			while (temp.next != null) {
				if (temp.next.data == i) {
					Node temp1 = temp.next.next;
					temp.next = temp1;
				}
				temp = temp.next;
			}
		}

	}

}
