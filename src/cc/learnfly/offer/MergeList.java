package cc.learnfly.offer;

public class MergeList {

	 public static ListNode Merge(ListNode list1,ListNode list2) {
		 if(list1 == null){
			 return list2;
		 }
		 if(list2 == null){
			 return list1;
		 }
		 ListNode list = null;
		 if(list1.val < list2.val){
			 list = new ListNode(list1.val);
			 list1 = list1.next;
		 }else{
			 list = new ListNode(list2.val);
			 list2 = list2.next;
		 }
		 ListNode head = list;
		 while(list1 != null && list2 != null){
			 if(list1.val < list2.val){
				 ListNode temp = new ListNode(list1.val);
				 list.next = temp;
				 list1 = list1.next;
				 list = list.next;
			 }else{
				 ListNode temp = new ListNode(list2.val);
				 list.next = temp;
				 list2 = list2.next;
				 list = list.next;
			 }
		 }
		 if(list1 != null){
			 list.next = list1;
		 }
		 if(list2 != null){
			 list.next = list2;
		 }
		return head;
	        
	 }
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		node1.next = node3;
		node3.next = node5;
		
		node2.next = node4;
		node4.next = node6;
		
		Merge(node1,node2);
	}

}
