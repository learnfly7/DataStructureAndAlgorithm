package cc.learnfly.offer;

public class NumberOf1Between1AndN_Solution {

	public int NumberOf1Between1AndN_Solution(int n) {
	    int count = 0;
	    for(int i = 1; i <= n; i++){
	    	String str = String.valueOf(i);
	    	for(int j = 0; j < str.length(); j++){	
	    		if(str.charAt(j) == '1'){
	    			count++;
	    		}
	    	}
	    }
	    return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
