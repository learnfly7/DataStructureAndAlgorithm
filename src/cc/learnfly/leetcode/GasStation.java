package cc.learnfly.leetcode;

public class GasStation {
	
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0, left = 0;
		int index = -1;
		for(int i = 0; i < gas.length; i++){
			total += gas[i] - cost[i];
			left += gas[i] - cost[i];
			if(left < 0){
				left = 0;
				index = i;
			}
		}
		if(total >= 0){
			return index + 1;
		}
		return -1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
