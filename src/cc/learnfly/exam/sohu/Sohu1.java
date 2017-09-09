package cc.learnfly.exam.sohu;


import java.util.Scanner;

public class Sohu1 {
	
	public static void count(int n, int m, int[] a){
		int [] b = new int[n];
		b[0] = a[0];
		int k = 0;
		int index = 0;
		int i = 0;
		while(i < n){
			int temp = 0;
			int j = -1;
			if(k < i){
				j = b[k];
			}else{
				j = a[k];
			}
			while(temp < j && i < n){				
				b[i] = a[index];
				i++; temp++;
			}
			if(index == m - 1){
				index = 0;
			}else{
				index++;
			}
			k++;
		}
		
		for(int j = 0; j < n;j++){
			System.out.println(b[j]);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int[] a = new int[m];
			for(int i = 0; i < m; i++){
				a[i] = scan.nextInt();
			}
			count(n, m, a);	
		}
			
				
		scan.close();

	}

}
