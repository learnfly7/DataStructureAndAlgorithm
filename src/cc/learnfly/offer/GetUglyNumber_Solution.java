package cc.learnfly.offer;

public class GetUglyNumber_Solution {

	public static int GetUglyNumber_Solution(int index) {
		if(index <= 0){
			return 0;
		}
		int[] arr = new int[index];
		int n2 = 0,n3 = 0, n5 = 0;
		arr[0] = 1;
		for(int i=1;i<index;i++){
			int num2 = arr[n2]*2;
			int num3 = arr[n3]*3;
			int num5 = arr[n5]*5;
			int min = Math.min(num2, Math.min(num3, num5));
			if(num2 == min){
				n2++;
			}
			if(num3 == min){
				n3++;
			}
			if(num5 == min){
				n5++;
			}
			arr[i] = min;
		}
        return arr[index-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetUglyNumber_Solution(7);
	}

}
