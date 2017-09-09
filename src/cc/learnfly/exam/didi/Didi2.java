package cc.learnfly.exam.didi;


import java.util.Arrays;
import java.util.Scanner;

public class Didi2 {
	
	public static int count(int[] a, int k){
		Arrays.sort(a);
		int n = a.length;
		int num = 1;
		int index = -1;
		for(int i = n - 2; i > 0; i--){
			if(num == k){
				index = i +1;
				break;
			}
			if(a[i] != a[i + 1]){
				num++;
			}
			
		}	
		return a[index];
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			int k = scan.nextInt();
			String[] strs = str.split(" ");
			int n = strs.length;
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = Integer.parseInt(strs[i]);
			}
			System.out.println(count(a,k));	
		}
			
				
		scan.close();

	}

}
