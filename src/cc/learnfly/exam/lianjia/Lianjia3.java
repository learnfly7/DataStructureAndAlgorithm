package cc.learnfly.exam.lianjia;
import java.util.Scanner;

public class Lianjia3 {
	public static void distinct(int h, int[] a){
		if(a == null || a.length == 0){
			return;
		}
		int count = 0;
		for(int i = 0 ; i < a.length ; i++){
			if(a[i] <= h + 30){
				count++;
			}
		}
		System.out.println(count);
	}
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int[] a = new int[10];
			for(int i = 0 ; i < 10 ; i++){
				a[i] = scan.nextInt();
			}
			int h = scan.nextInt();
			distinct(h,a);
		}
		scan.close();
		
	}

}