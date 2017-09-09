package cc.learnfly.exam.wangyi;

import java.util.HashMap;
import java.util.Scanner;

public class Wangyi {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] x=  new int[n];
		int [] y= new int[n];
		for(int i=0;i<n;i++){
			x[i] =scan.nextInt();
		}
		for(int i=0;i<n;i++){
			y[i] =scan.nextInt();
		}
		long[] res = new long[n];
		long sum1 = 0;
		long sum2 = 0;
		for(int i=0;i<n;i++)
		{
			sum1 += x[i];
			sum2 += y[i];
			if(i == 0)
				res[i] = 0;
			else{
				Double a1 = sum1*1.0/(i+1);
				Double a2 = sum2*1.0/(i+1);
				Double minDis = Double.MAX_VALUE;
				int minI = 0;
				HashMap<Integer, Double>  map = new HashMap<Integer,Double>();
				for(int j=0;j<=i;j++){
					double dis = Math.abs(x[j]-a1) +Math.abs(y[j]-a2);
					if(dis <= minDis)
					{
						minDis = dis;
						minI = j;
						map.put(minI, minDis);
					}
				}
				long tmp1 = Long.MAX_VALUE;
				for(Integer k : map.keySet())
				{
					if(map.get(k) != minDis)
						continue;
					long tmp = 0;
					for(int j=0;j<=i;j++)
					{
						tmp += Math.abs(x[j]-x[k]) + Math.abs(y[j]-y[k]);
					}
					if(tmp < tmp1)
						tmp1 = tmp;
				}
				res[i] = tmp1;
			}
		}
		
		for(int i=0;i<n;i++) {
            if(i<n-1)
				System.out.print(res[i] + " ");
            else
                System.out.print(res[i]);
        }
	}
	
}


