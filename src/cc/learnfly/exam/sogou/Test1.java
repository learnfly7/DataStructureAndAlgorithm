package cc.learnfly.exam.sogou;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1{
	public static void count(int n, double[] points, int num){

		int lindex = 0;
		double max = 0;
		for(int i = 0; i < n; i++)	{
			double dif = 0;
			if(points[n - 1] - points[i] < 180.0){
				dif = points[n - 1] - points[i];
			}else{
				for(int k = n-1;k > 0;k--) {
                    if(points[k] - points[i] < 180.0) {
                        lindex = k;
                        break;
                    }
                }
				if(360.0-(points[lindex+1]-points[i]) > points[lindex]-points[i]){
					dif = 360.0-(points[lindex+1]-points[i]);
				}else{
					dif =  points[lindex]-points[i];
				}
                
            }
            if(dif > max){
            	max=dif;
            }
                
			
		}
		System.out.printf("%.8f", max);
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] points = new double[n];
		int k = 0;
		for (int i = 0; i < n; i++)	{
			points[i] = Double.parseDouble(br.readLine());
			if (points[i] <= 180.0)
				k++;
		}
		count(n, points, k);
	}
}

