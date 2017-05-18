package cc.learnfly.offer;

import java.util.ArrayList;
import java.util.List;

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}

public class PrintListFromTailToHead {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
        if(listNode == null){
        	return list;
        }
        getNext(listNode,list);
        return list;
    }
	
	public void getNext(ListNode listNode,ArrayList<Integer> list){
		if(listNode == null){
			return;
		}
		getNext(listNode.next,list);
		list.add(listNode.val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
