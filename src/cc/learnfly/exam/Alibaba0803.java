package cc.learnfly.exam;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Alibaba0803 {

    static int cut(int[] parts) {
    	if(parts == null || parts.length == 0 || parts.length == 1){
    		return 0;
    	}
    	int n = parts.length;
    	if(n ==2){
    		return parts[0] + parts[1];
    	}
    	 Queue<Integer> queue = new PriorityQueue<>(n);
    	
    	for(int i = 0; i < n;i++){
    		queue.add(parts[i]);
    	}
    	int sum = 0;
    	while(queue.size() > 1){
    		int a = queue.poll();
    		int b = queue.poll();
    		sum += (a+b);
    		if(queue.size() >= 1){
    			queue.add(a+b);
    		}    		
    	}
    	if(queue.size()>0){
    		sum += queue.peek();
    	}
    	return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int pieces = Integer.parseInt(in.nextLine().trim());
        int[] parts = new int[pieces];
        for (int i = 0; i < pieces; i++) {
            parts[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(cut(parts));
        in.close();
    }
}