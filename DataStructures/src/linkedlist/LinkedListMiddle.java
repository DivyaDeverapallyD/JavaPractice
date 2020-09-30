package linkedlist;
import linkedlist.LinkedList;

// find middle element - got mid point and found midelememt
//dfds
public class LinkedListMiddle {
	
public static void main(String... args)
{
//	LinkedList.addData(list, data);
	LinkedList list= new LinkedList();
	list.addData(list,2);
	list.addData(list,3);
	list.addData(list,6);	
	list.addData(list,10);
	list.addData(list,15);
	list.addData(list,100);
	
	//LinkedList.printList();
	
	int  mid= findMiddle(list);
	System.out.println(mid);
}

private static int findMiddle(LinkedList list) {
	// TODO Auto-generated method stub
	list.printList(list);
	int size=0,count=0;
	Node temp=list.head;
	while(temp!=null)
	{
		size++;
		temp=temp.next;
	}
	
	int mid=(size+1)/2;Node temp2=list.head;
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
