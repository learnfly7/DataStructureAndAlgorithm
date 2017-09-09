package cc.learnfly.exam.sogou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			double[] points = new double[n];
			for(int i = 0; i < n; i++){
				points[i] = Double.parseDouble(br.readLine());
			}
			calc(n, points);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void calc(int n, double[] points) {
		
		double max = 0;
		for(int i = 1 ; i < n ;i++){
			double temp = points[i] - points[0];
			if(temp > 180){
				temp = 360 - points[i];
			}
			if(temp > max){
				max = temp;
			}
		}
		BigDecimal   b   =   new   BigDecimal(max);   
		System.out.println(b.setScale(8,   BigDecimal.ROUND_HALF_UP).doubleValue());
	}


	

}