/**
 * 
 */
package leetCodeProbs;

/**
 * @author Divya Deverapally
 *
 *
 */

 class ListNode {
	     int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
public class ListMerge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

	}
	
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        
        ListNode resList = new ListNode();
        
        
         while( l1 != null)
         {
        	ListNode  temp1 = l1.next;
        	ListNode max=null;
        	while(l2 != null)
        	{
        		
        		 ListNode temp2= l2.next;
        		 
        		 if(temp1.val< temp2.val)
        		 {
        			 max= temp2;
        			 
        		 }
        		 else
        			 max= temp1;
        		
        		temp2=temp2.next;
        	}
        	
        	resList.next= max;
        	temp1=temp1.next;
        	 
         }
		return resList;
        
        
        
        
        
        
    }

}
