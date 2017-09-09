package cc.learnfly.exam.lianjia;
import java.util.Scanner;

public class Lianjia090202 {
	public static int count(int n, int[] v){
		if(v == null || v.length == 0){
			return 0;
		}
		int[][] a = new int[n + 2][n + 2];
		for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= n-i+1; j++) { 
                a[j][i] = Math.max(a[j+1][i-1] + (n-i+1)*v[j], a[j][i-1] + (n-i+1)*v[j+i-1]);  
            }  
        }  
		return a[1][n];
		
	}
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] v = new int[n + 1];
			for(int i = 1 ; i <= n ; i++){
				v[i] = scan.nextInt();
			}
			System.out.println(count(n,v));
		}
		scan.close();
		
	}

}