package cc.learnfly.exam.chubao;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main2 {

	public static void calc(int n, double[][] a){
		double time = 0, min = Double.MAX_VALUE;		
		while (true){
			time += 0.01;
			for (int i = 0; i < n; i++)
			{
				a[i][0] = a[i][0] + a[i][2] * 0.01;
				a[i][1] = a[i][1] + a[i][3] * 0.01;
			}
			double temp = count(a, n);
			if (temp >= min){
				break;
			}else{
				min = temp;
			}				
		}
		  DecimalFormat    df   = new DecimalFormat("######0.00");  
		  System.out.println(df.format(time-0.01) + " " + df.format(min)); 
		System.out.println(String.format("%.2f", time-0.01)+" "+String.format("%.2f", min));
		System.out.printf("%.2f"+ " "+"%.2f", time - 0.01, min);
	}
	
	public static double distance(double[] x, double[] y){
		return Math.sqrt((x[0] - y[0]) * (x[0] - y[0]) + (x[1] - y[1]) * (x[1] - y[1]));
	}

	public static double count(double[][] a, int n){
		double d = 0;
		for (int i = 0; i < n; i++){
			for (int j = 1; j < n; j++){
				double temp = distance(a[i], a[j]);
				if (temp > d){
					d = temp;
				}
			}
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = Integer.parseInt(scan.nextLine());
			double[][] a = new double[n][4];
			for (int i = 0; i < n; i++){
				String[] strs = scan.nextLine().split(" ");
				for (int j = 0; j < 4; j++){
					a[i][j] = Double.parseDouble(strs[j]);
				}			
			}			
			calc( n, a);
		}
		scan.close();
	}
}
