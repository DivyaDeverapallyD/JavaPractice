package linkedlist;
import linkedlist.LinkedList;

// find middle element - got mid point and found midelememt
//dfds
public class LinkedListMiddle {
	
public static void main(String... args)
{
//	LinkedList.addData(list, data);
	LinkedList.addData(2);
	LinkedList.addData(3);
	LinkedList.addData(6);	
	LinkedList.addData(10);
	LinkedList.addData(15);
	LinkedList.addData(100);
	
	//LinkedList.printList();
	
	int  mid= findMiddle();
	System.out.println(mid);
}

private static int findMiddle() {
	// TODO Auto-generated method stub
	LinkedList.printList();
	int size=0,count=0;
	Node temp=LinkedList.head;
	while(temp!=null)
	{
		size++;
		temp=temp.next;
	}
	
	int mid=(size+1)/2;Node temp2=LinkedList.head;
	while(temp2!=null)
	{
		count++;
		if(count==mid)
		{
			return temp2.data;
		}
		else
			temp2=temp2.next;
	}
	return 0;
}

}
