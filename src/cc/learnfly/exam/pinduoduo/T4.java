package cc.learnfly.exam.pinduoduo;

import java.util.HashMap;

public class T4 {

	public static int count = 1;
	
	public static HashMap<Integer, Integer> map =new HashMap<>();
	public static void  calc(int n,int m){
		map.put(n, m);
		if(move(0) && !exist(n,m+1)){
			count++;
			calc(n,m+1);
		}	
		if(move(1) && !exist(n,m-1)){
			count++;
			calc(n,m-1);
		}
		if(move(2) && !exist(n-1,m)){
			count++;
			calc(n-1,m);
		}
		if(move(3) && !exist(n+1,m)){
			count++;
			calc(n+1,m);
		}
		
	}
	
	/**
	 * 判断n，m点有没有被访问过
	 * @param n
	 * @param m
	 * @return
	 */
	public static boolean exist(int n,int m){
		if(map.containsKey(n) && map.get(n)==m){
			return true;
		}
		return false;
	}
	
	/**
	 * 假设move方法已经给定
	 * @param direction
	 * @return
	 */
	public static boolean move(int direction){
		return true;
	}
	
	public static void main(String[] args) {
		calc(0,0);
		System.out.println(count);
	}

}