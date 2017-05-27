package cc.learnfly.offer;

public class VerifySquenceOfBST {

	/**
	 * 
	 * 对于每一个后序遍历序列，最后一个元素是根节点，根节点前的元素，前面一段小于根节点的值，后面一段大于根节点的值，使用递归
	 *
	 * @param sequence
	 * @return
	 */
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
        	return false;
        }
        return judge(sequence, 0, sequence.length-1);
    }
	
	public boolean judge(int[] a,int left,int right){
		if(left >= right){
			return true;
		}
		int i=left;
		while(i<right && a[i]<a[right]){
			i++;
		}
		int mid = i;
		while(i<right && a[i] > a[right]){
			i++;
		}
		if(i != right){
			return false;
		}
		return judge(a, left, i-1) && judge(a, i, right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
