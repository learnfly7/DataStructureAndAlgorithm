package cc.learnfly.leetcode;

import java.util.HashMap;
import java.util.Iterator;

public class MaxPointsOnLine {

	public int maxPoints(Point[] points) {
		if(points == null){
			return 0;
		}
		int n = points.length;
        if(n < 2){
        	return n;
        }
        int max = 0;
        for(int i = 0; i < n; i++){
        	int num1 = 1, num2 = 0;
        	Point a = points[i];
        	HashMap<Float,Integer> map = new HashMap<>();
        	for(int j = 0; j < n; j++){
        		if(i == j){
        			continue;
        		}
        		Point b = points[j];
        		if(a.x == b.x){
        			if(a.y == b.y){
        				num1++;
        			}else{
        				num2++;
        			}
        		}else{
        			float k = (float)(b.y - a.y) / (b.x - a.x);
        			if(map.get(k) == null){
        				map.put(k, 1);
        			}else{
        				map.put(k, map.get(k) + 1);
        			}
        		}
        	}
        	
        	int temp = num2;
        	for(Float k : map.keySet()){
        		if(map.get(k) > temp){
        			temp = map.get(k);
        		}
        	}
        	max = Math.max(max, temp + num1);
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Point {
	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int a, int b) {
		x = a;
		y = b;
	}
}