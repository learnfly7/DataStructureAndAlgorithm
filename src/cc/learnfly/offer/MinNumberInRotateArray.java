package cc.learnfly.offer;

public class MinNumberInRotateArray {

	public int minNumberInRotateArray(int [] array) {
		int n = array.length;
		if(n == 0){
			return 0;
		}
		int l = 0, r = n -1;
		while(l < r){
			int m = l + (r - l)/2;
			if(array[m]==array[r]){
				r = r -1;
			}else if(array[m] > array[r]){
				l = m + 1;
			}else{
				r = m;
			}
		}
		return array[l];
	    
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinNumberInRotateArray m = new MinNumberInRotateArray();
		int[] a = {3,4,5,6,6,1,2};
		System.out.println(m.minNumberInRotateArray(a));
	}

}
