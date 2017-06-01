package cc.learnfly.leetcode;

public class SingleNumber {

	public int singleNumber(int[] A) {
        if(A == null || A.length == 0){
        	return -1;
        }
        for(int i = 1; i < A.length; i++){
        	A[0] ^= A[i];
        }
        return A[0];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
