package cc.learnfly.leetcode;
/**
 * 
 *  A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list. 

 */
public class CopyRandomList {
	
	public RandomListNode copyRandomList(RandomListNode head) {
        if(head ==  null){
        	return null;
        }
        RandomListNode node = head;
        //在当前链表每个结点后插入当前结点的拷贝结点
        while(node != null){
        	RandomListNode temp = new RandomListNode(node.label);
        	temp.next = node.next;
        	temp.random = node.random;
        	node.next = temp;        	
        	node = node.next.next;
        }
        //再次遍历，设置random
        node = head.next;
        while(node != null){
        	if(node.next != null){
        		node.next = node.next.next;
        	}
        	if(node.random != null){
        		node.random = node.random.next;
        	}
        	node = node.next;
        }
		return head.next;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
};
