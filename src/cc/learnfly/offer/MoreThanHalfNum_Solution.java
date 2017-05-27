package cc.learnfly.offer;

public class MoreThanHalfNum_Solution {
	/**
	 * 
	 * 数组中出现次数超过一半的数字，简单的方法，排序后选中间的元素，统计该元素的出现次数，复杂度O(nlgn)
	 * 简单的方法，num保存出现次数最多的数，
	 * @param array
	 * @return
	 */
	public int MoreThanHalfNum_Solution(int [] array) {
        int n = array.length;
        if(n == 0){
        	return 0;
        }
        int num = array[0];
        int count = 1;
        for(int i = 1; i < n; i++){
        	if(array[i] == num){
        		count++;
        	}else{
        		count--;
        	}
        	if(count == 0){
        		num = array[i];
        		count = 1;
        	}
        }
        count = 0;
        for(int i = 0; i < n; i++){
        	if(array[i] == num){
        		count++;
        	}
        }
        if(count > n/2){
        	return num;
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
