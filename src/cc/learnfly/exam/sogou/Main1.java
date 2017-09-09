package cc.learnfly.exam.sogou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main1 {

	public static void main(String[] args) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			BigDecimal[] points = new BigDecimal[n];
			for(int i = 0; i < n; i++){
				points[i] = new BigDecimal(br.readLine()).setScale(8,BigDecimal.ROUND_HALF_UP);
				
			}
			calc(n, points);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void calc(int n, BigDecimal[] points) {
		
		BigDecimal max = new BigDecimal("0.00000000").setScale(8,BigDecimal.ROUND_HALF_UP);
		System.out.println(max);
		BigDecimal all = new BigDecimal("360.00000000").setScale(8,BigDecimal.ROUND_HALF_UP);
		BigDecimal s = new BigDecimal("180.00000000").setScale(8,BigDecimal.ROUND_HALF_UP);
		for(int i = 1 ; i < n ;i++){
			BigDecimal temp = points[i].subtract(points[0]);
			if(temp.compareTo(s) > 0){
				temp = all.setScale(8,BigDecimal.ROUND_HALF_UP).subtract(points[i]);
			}
			if(temp.compareTo(max) > 0){
				max = temp;
			}
		}
		System.out.println(max.setScale(8,   BigDecimal.ROUND_HALF_UP).doubleValue());
	}


	

}