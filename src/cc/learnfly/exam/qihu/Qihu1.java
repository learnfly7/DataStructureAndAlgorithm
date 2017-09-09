package cc.learnfly.exam.qihu;


import java.util.Scanner;

public class Qihu1 {
	
	public static int count(int n, int m, int a, int b, int c, int d, int x, int y, int z){
		int temp = -1;
		if(n/a > m/b){
			temp = m/b;
		}else{
			temp = n/a;
		}
		int max = 0;
		for(int i = 0; i <= temp; i++)
		{
			int result1 = (n - i * a) / d;
			int result2 = (m - i * b) / c;
			if(i*x + result1*z + result2*y > max)
				max = i*x + result1*z + result2*y;
		}		
        return max;		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			System.out.println(count(n, m, a, b, c, d, x, y, z));	
		}
			
				
		scan.close();

	}

}
