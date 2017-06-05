package cc.learnfly.leetcode;

public class Candy {

	public int candy(int[] ratings) {
        if(ratings == null || ratings.length == 0){
        	return 0;
        }
        int n = ratings.length;
        int[] cost = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
        	cost[i] = 1;
        }
        for(int i = 1; i < n; i++){
        	if(ratings[i] > ratings[i-1]){
        		cost[i] = cost[i-1] + 1;
        	}
        }
        for(int i = n - 1; i > 0 ;i --){
        	sum += cost[i];
        	if(ratings[i] < ratings[i-1] && cost[i] >= cost[i-1]){
        		cost[i-1] = cost[i] + 1;
        	}
        }
        sum += cost[0];
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
