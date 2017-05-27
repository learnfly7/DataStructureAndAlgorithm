package cc.learnfly.offer;

public class FindGreatestSumOfSubArray {

	public int FindGreatestSumOfSubArray(int[] array) {
		int n = array.length;
        if(n == 0){
        	return 0;
        }
        int sum = array[0], maxSum = array[0];
        for(int i = 1;i < n; i++){
        	if(sum >= 0){
        		sum += array[i];
        	}else{
        		sum = array[i];
        	}
        	if(sum > maxSum){
        		maxSum = sum;
        	}
        }
        return maxSum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
