package cc.learnfly.exam.ofo;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strs = sc.nextLine().split(" ");
		int n = sc.nextInt();
		BigInteger[] nums = new BigInteger[n];
		nums[0] = BigInteger.valueOf(Integer.parseInt(strs[0]));
		
		nums[1] = BigInteger.valueOf(Integer.parseInt(strs[1]));
		nums[2] =  BigInteger.valueOf(Integer.parseInt(strs[2]));
		int cc = n-3;
		int i=3;
		while(cc-->0){
			nums[i] = nums[i-1].add(nums[i-2]).add(nums[i-3]);
			i++;
		}
		System.out.println(nums[n-1].mod(BigInteger.valueOf(10000)));
	}

}