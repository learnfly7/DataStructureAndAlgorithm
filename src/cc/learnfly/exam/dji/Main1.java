package cc.learnfly.exam.dji;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
class MMNode{
	 int x;
	 int y;
	 int prex;
	 int prey;
	 MMNode(int x,int y){
	     this.x=x;
	     this.y=y;
	 }
	}
public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int sx = scan.nextInt();
			int sy = scan.nextInt();
			int ex = scan.nextInt();
			int ey = scan.nextInt();
			int[][] a = new int[n][m];
			for(int i = 0; i < n;i++){
				for(int j=  0;j < m; j++){
					a[i][j] = scan.nextInt();
				}
			}
			count(n, m, sx, sy, ex, ey, a);
		}
		scan.close();
		
	}

	private static void count(int n, int m, int sx, int sy, int ex, int ey, int[][] a) {
		for(int i = 0; i < n;i++){
			for(int j=  0;j < m; j++){
				if(a[i][j] > 1){
					search(i, j, a, n, m);
				}
			}
		}
		//接下来求起点和重点的最短路径长度，矩阵已经是0和1，需要绕过1
		System.out.println(breadthFirst(n,m,a));
	}

	private static void search(int i, int j, int[][] a, int n, int m) {
		int num = a[i][j];
		int k = num;
		int i1 = i, j1 = j;
		a[i][j] = 1;  
        //分别从四个方向找出1点
        while(k-- >= 0 && --j1 >= 0 && a[i1][j1] == 0){
        	a[i1][j1] = 1;
        }
        k = num;
        i1 = i; j1 = j;
        while(k-- >= 0 && ++j >= 0 && a[i][j] == 0){
        	a[i1][j1] = 1;
        }
        k = num;
        i1 = i; j1 = j;
        while(k-- >= 0 && --i1 >= 0 && a[i1][j1] == 0){
        	a[i1][j1] = 1;
        }
        k = num;
        i1 = i; j1 = j;
        while(k-- >= 0 && ++i1 >= 0 && a[i1][j1] == 0){
        	a[i1][j1] = 1;
        }
	}
	
	public static int breadthFirst(int m,int n, int[][] a) {
		int count=0;

		 int[][] dir = {{1, 0}, {0, 1}};
         int[][] visited=new int[m][n];
         MMNode start=new MMNode(0,0);
         MMNode end=new MMNode(m-1,n-1);
         Queue<MMNode> queue=new LinkedList<MMNode>();
         ArrayList<MMNode> arrayList=new ArrayList<MMNode>();
         queue.offer(start);
         while (!queue.isEmpty()){
             MMNode local=queue.remove();
             arrayList.add(local); 
             for (int i=0;i<2;i++){
                 MMNode nbr=new MMNode(local.x+dir[i][0],local.y+dir[i][1]);
                 if(nbr.x>=0&&nbr.x<m&&nbr.y>=0&&nbr.y<n&&a[nbr.x][nbr.y]==0&&visited[nbr.x][nbr.y]==0){
                     visited[nbr.x][nbr.y]=1;
                     queue.offer(nbr);
                     nbr.prex=local.x;
                     nbr.prey=local.y;
                 }
             }
         }
         Stack<Integer> stack=new Stack<Integer>();
         int  px=arrayList.get(arrayList.size()-1).prex;
         int  py=arrayList.get(arrayList.size()-1).prey;
         stack.push(arrayList.size()-1);
         while (true){
             if(px==0&&py==0){
                 break;
             }
             for(int i=0;i<arrayList.size();i++){
                 if(arrayList.get(i).x==px&&arrayList.get(i).y==py){
                     px=arrayList.get(i).prex;
                     py=arrayList.get(i).prey;
                     stack.push(i);
                     break;
                 }
             }
         }
         while (!stack.isEmpty()){
        	 count++;
             stack.pop();
         }
         return count;

     }
}