package cc.learnfly.exam.didi;


import java.util.Scanner;

public class Didi1 {
	
	public static int count(int[] a, int n){
		if(n == 0){
        	return 0;
        }
        int s = a[0], max = a[0];
        for(int i = 1;i < n; i++){
        	if(s >= 0){
        		s += a[i];
        	}else{
        		s = a[i];
        	}
        	if(s > max){
        		max = s;
        	}
        }
        return max;		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			String[] strs = str.split(" ");
			int n = strs.length;
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = Integer.parseInt(strs[i]);
			}
			System.out.println(count(a,n));	
		}
			
				
		scan.close();

	}

}
