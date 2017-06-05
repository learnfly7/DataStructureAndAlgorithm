package cc.learnfly.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.

For example, given s ="aab",
Return1since the palindrome partitioning["aa","b"]could be produced using 1 cut. 
 */
public class PalindromePartitioningi {

	public ArrayList<ArrayList<String>> partition(String s) {
		ArrayList<ArrayList<String>> lists = new ArrayList<>();
		
		int n = s.length();
		for(int i = 0; i < n; i++){
			String temp = s.substring(0,i+1);
			if(isPalindrome(temp)){
				if(i + 1 == n){
					ArrayList<String> list = new ArrayList<>();
					list.add(temp);
					lists.add(list);
				}else{
					List list1 = partition(s.substring(i+1));
					for(int j= 0;j<list1.size();j++){
						ArrayList<String> list = new ArrayList<>();
						list.add(temp);
						list.addAll((Collection<? extends String>) list1.get(j));
						lists.add(list);
					}
				}
			}
		}
		return lists;
    }
	public void find(String s, ArrayList<String> list,ArrayList<ArrayList<String>> lists ){
		if(s.length() < 1){
			lists.add(list);
			return;
		}
		
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
		PalindromePartitioningi p = new PalindromePartitioningi();
		p.partition("a");
		System.out.println(isPalindrome("a"));
	}

}
