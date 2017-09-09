package cc.learnfly.exam.dji;

import java.util.Arrays;
import java.util.Scanner;

public class Main4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] b = in.nextLine().split(" ");
		int n = Integer.parseInt(b[0]);
		int m = Integer.parseInt(b[1]);
		int r = Integer.parseInt(b[2]);
		String[] a = in.nextLine().split(" ");
		int[] num = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(a[i]) / r;
		}
		Arrays.sort(num);
		for (int i = n - 1; i >= 0; i--)
		{
			if (num[i] >= 1 && k <= m - 1)
			{
				k++;
				num[i] = num[i] - 1;
			}
			if (i + 1 < n && num[i + 1] <= 0 || k >= m)
				break;
		}
		int res = 0;
		while (k >= m)
		{
			res += k / m;
			k = 0;
			Arrays.sort(num);
			for (int i = n - 1; i >= 0; i--)
			{
				if (num[i] >= 1 && k <= m - 1)
				{
					k++;
					num[i]--;
				}
				if (i + 1 < n && num[i + 1] <= 0 || k >= m)
					break;
			}
		}
		System.out.println(res);
	}
}

