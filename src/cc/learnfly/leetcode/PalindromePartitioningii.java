package cc.learnfly.leetcode;

/**
 * 
 Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.

For example, given s ="aab",
Return1since the palindrome partitioning["aa","b"]could be produced using 1 cut. 
 */
public class PalindromePartitioningii {

	public int minCut(String s) {
        int n = s.length();
        int[] cut = new int[n];
        for(int i = 0; i < n; i++){
        	if(isPalindrome(s.substring(0, i + 1))){
        		cut[i] = 0;
        	}else{
        		cut[i] = i;
        	}
        	if(cut[i] == 0){
        		continue;
        	}
        	for(int j = 1; j <= i; j++){
        		if(isPalindrome(s.substring(j, i + 1))){
        			cut[i] = Math.min(cut[i], cut[j - 1] + 1);
        		}else{
        			cut[i] = Math.min(cut[i], cut[j - 1] + i + 1 - j);
        		}
        	}
        	
        }
		return cut[n - 1];
        
    }

	public static boolean isPalindrome(String s) {
		boolean flag = true;
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				flag = false;
				break;
			}

		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
