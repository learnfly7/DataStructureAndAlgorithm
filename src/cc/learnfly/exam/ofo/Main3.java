package cc.learnfly.exam.ofo;

import java.util.*;
public class Main3 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static String[] Check24(double[][] data) {
    	int n = data.length;
    	String[] result = new String[n];
    	int m = data[0].length;
    	for(int i = 0; i < n; i++){
    		result[i] = String.valueOf(calc(data[i],m,m));
    	}
    	
		return result;

    }
    
    public static boolean calc(double [] a, int n,int m){
    	if(n == 1){
    		if(Math.abs(a[0]-24) < 10e-12) { 
    			return true;
    		}else{
    			return false;
    		} 
    	}

    	for(int i = 0; i< n; i++){
    		for(int j = i+1; j < n; j++){
    			double t1 = a[i];
    			double t2 = a[j];
    			double[] b = new double[m];
    			int index = 0;
    			for(int k = 0; k < n; k++){
			    	if((k != i) && (k != j)) {
			    		b[index++] = a[k];
			    	}
			   	}

    			b[n-2] = t1+t2;
    			if(calc(b,n-1,m)){
    				return true;
    			}
    			b[n-2] = t1*t2;
    			if(calc(b,n-1,m)) {
    				return true;
    			}
    			b[n-2] = t1-t2;
    			if(calc(b,n-1,m)){
    				return true;
    			}
    			b[n-2] = t2-t1;

    			if(calc(b,n-1,m)) {
    				return true;
    			}
    			b[n-2] = t1/t2;

    			if(calc(b,n-1,m)){
    				return true;
    			} 
    			b[n-2] = t2/t1;
		    	if(calc(b,n-1,m)) {
		    		return true;
		    	}

    		}

    	}

    	return false;
    	
    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] res;
            
        int _data_rows = 0;
        int _data_cols = 0;
        _data_rows = Integer.parseInt(in.nextLine().trim());
        _data_cols = Integer.parseInt(in.nextLine().trim());
        
        double[][] _data = new double[_data_rows][_data_cols];
        for(int _data_i=0; _data_i<_data_rows; _data_i++) {
            for(int _data_j=0; _data_j<_data_cols; _data_j++) {
                _data[_data_i][_data_j] = in.nextDouble();
                
            }
        }   

        if(in.hasNextLine()) {
          in.nextLine();
        }
  
        res = Check24(_data);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
