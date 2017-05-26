package cc.learnfly.offer;

public class DoublePower {

	public double Power(double base, int exponent) {
       double result = 1;
       for(int i = 0;i<Math.abs(exponent);i++){
    	   result *= base;
       }
       if(exponent < 0){
    	   result = 1/result;
       }
       return result;
	}
}
