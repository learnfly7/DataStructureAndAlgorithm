package cc.learnfly.exam.dji;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int H = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int h = scan.nextInt();
			int s = scan.nextInt();
			count(H, x, y, h, s);
		}
		scan.close();
		
	}

	private static void count(int H, int x, int y, int h, int s) {
		double result = 0.0;
		if(s * x <= h){
			result = s * x;
		}else if(x >= y){
			result = h + (s - h / x) * (x - y);
			if(result > H){
				result = H;
			}
		}else{
			result = h;
		}
		System.out.println(new BigDecimal(String.valueOf(result)).setScale(0, BigDecimal.ROUND_HALF_UP));
	}

}
