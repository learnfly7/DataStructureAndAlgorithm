package cc.learnfly.offer;

import java.util.ArrayList;

public class GetLeastNumbers_Solution {

	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> list = new ArrayList<>();
        if(input.length == 0 || input.length < k || k <= 0){
        	return list;
        }
        int l = 0, r = input.length-1;
        int index = partition(input, l, r);
        while(index != k-1){
        	if(index > k-1){
        		r = index -1;
        		index = partition(input, l, r);
        	}else{
        		l = index + 1;
        		index = partition(input, l, r);
        	}
        }
        for(int i = 0; i < k; i++){
        	list.add(input[i]);
        }
        return list;
    }
	public  int partition(int[] a, int low, int high){
		int l = low, h = high;
		int temp = a[l];
		while(l < h){
			while(l < h && a[h] >= temp){
				h--;
			}
			if(l < h){
				a[l] = a[h];
				l++;
			}
			
			
			while(l<h && a[l]<=temp){
				l++;
			}
			if(l <h){
				a[h] = a[l];
				h--;
			}
			
		}
		a[l]  =temp;
		return l;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
