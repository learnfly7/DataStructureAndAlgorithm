package cc.learnfly.offer;

public class Fibonacci {

	public static int Fibonacci(int n) {
		if(n == 1 || n == 2){
        	return 1;
        }
		int a = 1,b=1,i=3;
		int sum = 0;
		while(i <= n){
			sum = a + b;
			a = b;
			b = sum;
			i++;
		}
		return sum;
    }
	public static void main(String[] args) {
		System.out.println(Fibonacci(10));

	}

}
