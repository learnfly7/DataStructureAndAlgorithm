package cc.learnfly.leetcode;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
        	return true;
        }
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
        	while(i < j && !Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
        		i++;
        	}
        	while(i < j && !Character.isAlphabetic(s.charAt(j)) && !Character.isDigit(s.charAt(j))){
        		j--;
        	}
        	if(i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
        		return false;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
