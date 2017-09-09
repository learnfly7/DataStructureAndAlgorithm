package cc.learnfly.exam.chubao;

import java.util.Scanner;

public class Main1 {
	public static void find(int m, String[] subs, int n, String[] lib){
		for(int i = 0; i < m; i++){
			String sub = subs[i];
			int count = 0;
			for(int k = 0; k < n; k++){
				if(lib[k].indexOf(sub) > -1){
					count++;
				}
				
			}
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.nextLine());
			String[] lib = new String[n];
			for(int i = 0; i < n; i++){
				lib[i] = scan.nextLine();
			}
		
			int m = Integer.parseInt(scan.nextLine());
			String[] subs = new String[m];
			for(int i = 0; i < m ;i++){
				subs[i] = scan.nextLine();
			}
			find(m, subs, n, lib);
		}
		scan.close();
	}
}
