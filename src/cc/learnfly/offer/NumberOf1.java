package cc.learnfly.offer;

public class NumberOf1 {

	public int NumberOf1(int n) {
		int count = 0;
		while(n != 0){
			count++;
			n = n & (n-1);
		}
		return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
