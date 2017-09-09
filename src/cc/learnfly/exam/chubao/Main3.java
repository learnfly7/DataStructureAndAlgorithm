package cc.learnfly.exam.chubao;

import java.util.Scanner;

public class Main3
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			double t = 0;
			double dis = Double.MAX_VALUE;
			int n = Integer.parseInt(in.nextLine());
			double[][] a = new double[n][4];
			for (int i = 0; i < n; i++)
			{
				String[] tmp = in.nextLine().split(" ");
				for (int j = 0; j < 4; j++)
					a[i][j] = Double.parseDouble(tmp[j]);
				
			}
			while (true)
			{
				t += 0.01;
				for (int k = 0; k < n; k++)
				{
					a[k][0] = a[k][0] + a[k][2] * 0.01;
					a[k][1] = a[k][1] + a[k][3] * 0.01;
				}
				if (res(a, n) >= dis)
					break;
				else
					dis = res(a, n);
			}
			t -= 0.01;
			System.out.printf("x = %.2f, y = %.2f\n", t, dis);
		}
	}

	public static double distance(double[] a, double[] b)
	{
		return Math.sqrt((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]));
	}

	public static double res(double[][] a, int n)
	{
		double dis = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 1; j < n; j++)
			{
				if (distance(a[i], a[j]) > dis)
				{
					dis = distance(a[i], a[j]);
				}
			}
		}
		return dis;
	}

}

