package cc.learnfly.offer;

import java.util.Arrays;

public class ReOrderArray {

	public  void reOrderArray(int [] array) {
		int n = array.length;
        int oddCount = 0;
        for(int i=0;i < n;i++){
        	if(array[i] % 2 == 1){
        		oddCount++;
        	}
        }
        int[] copy = new int[n];
        int l=0,r = oddCount;
        for(int k=0;k<n;k++){
        	if(array[k] % 2 == 1){
        		copy[l] = array[k];
        		l++;
        	}else{
        		copy[r] = array[k];
        		r++;
        	}
        }
        for(int i=0;i < n;i++){
        	array[i] = copy[i];
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] array = {1,2,3,4,5,6,7};
		reOrderArray(array);*/
	}

}
