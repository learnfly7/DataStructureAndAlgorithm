package cc.learnfly.exam.toutiao;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Toutiao1 {
	@SuppressWarnings("unchecked")
	public static void find(int n, LinkedList<Point> list){
		Collections.sort(list);
		LinkedList<Point> newlist = new LinkedList<>();
		int maxIndex = 0;
		for(int i = 1; i< n;i++){
			if(list.get(i).y > list.get(maxIndex).y){
				maxIndex = i;
			}
		}
		for(int i = maxIndex; i < n; i++){
			int j = i+1;
			for(; j < n;j++){
				if(list.get(j).x > list.get(i).x && list.get(j).y > list.get(i).y){
					break;
				}
			}
			if(j == n){
				newlist.add(list.get(i));
			}
		}
		for(int i = 0; i < newlist.size();i++){
			System.out.println(newlist.get(i).x + " " + newlist.get(i).y);
		}
	}
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
        	int n = in.nextInt();
            LinkedList<Point> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int y=  in.nextInt();
                Point temp = new Point(x,y);
                list.add(temp);
            }
            find(n, list);
        }
        
    }
}

class Point implements Comparable{
	public int x;
	public int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Point p = (Point)o;
		return this.x>p.x? 1:-1;
	}
}