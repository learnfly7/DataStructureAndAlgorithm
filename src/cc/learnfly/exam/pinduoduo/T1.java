package cc.learnfly.exam.pinduoduo;

public class T1 {

	/**
	 * 从右上角往左走，1继续往左，碰到0往下，下一行是0继续往下，否则往左
	 * @param a
	 */
	public static void calc(int [][] a){
		if(a == null){
			return;
		}
		int m = a.length;
		int n = a[0].length;
		int i = 0,j = n-1;
		while(i<=m-1 && j >=0){
			//1，一直往左
			if(a[i][j] == 1){
				j--;
			}else{
				i++;
				
			}
		}
		//此时j+1位1最多的行第一个1开始的下标
		for(int k=0;k<m;k++){
			if(a[k][j+1]==1){
				System.out.println("["+k+","+ (n-j-1)+"]");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{0,0,0,0,1,1,1,1},
				{0,0,1,1,1,1,1,1},
				{0,0,0,0,0,0,1,1},
				{0,0,0,0,0,0,1,1},
				{0,0,0,0,0,0,1,1},
				{0,0,0,0,0,0,1,1},
				{0,0,1,1,1,1,1,1},
				{0,0,0,0,0,1,1,1},
		};
		calc(a);
	}

}
