package cc.learnfly.leetcode;

import java.util.Set;

public class WordBreak {
	
	public boolean wordBreak(String s, Set<String> dict) {
        int n = s.length();
        boolean[] arr = new boolean[n + 1];
        arr[0] = true;
        for(int i = 1; i < n + 1; i++){
        	for(int j = 0; j < i; j++){
        		if(arr[j] && dict.contains(s.substring(j, i))){
        			arr[i] = true;
        		}
        	}
        }
        return arr[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
