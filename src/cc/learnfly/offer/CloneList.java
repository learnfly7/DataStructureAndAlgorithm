package cc.learnfly.offer;


public class CloneList {

	public RandomListNode Clone(RandomListNode pHead)
    {	
		if(pHead ==  null){
        	return null;
        }
        RandomListNode node = pHead;
        //在当前链表每个结点后插入当前结点的拷贝结点
        while(node != null){
        	RandomListNode temp = new RandomListNode(node.label);
        	temp.next = node.next;
        	temp.random = node.random;
        	node.next = temp;        	
        	node = node.next.next;
        }
        //再次遍历，设置random
        node = pHead.next;
        while(node != null){
        	if(node.next != null){
        		node.next = node.next.next;
        	}
        	if(node.random != null){
        		node.random = node.random.next;
        	}
        	node = node.next;
        }
		return pHead.next;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}