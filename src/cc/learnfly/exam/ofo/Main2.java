package cc.learnfly.exam.ofo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
    static long MaxFactor(long n) {
    	long a = n, b = 1;
    	while(n > 1){
    		if(n % a == 0){
    			b = a;
    			n = n / a;
    			while(n % a == 0){
    				n = n / a;
    			}
    		}
    		
    		a = a + 1;
    	}
 
		return b;
    }
    
    public static boolean isPrime(int n)
    {
        int k, upperBound=n/2;

        for(k=3; k<=upperBound; k+=2)
        {
            upperBound=n/k;
            if(n%k==0)
                return false;
        }
       
        return true;
    } 
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long res;
            
        long _n;
        _n = Long.parseLong(in.nextLine().trim());
  
        res = MaxFactor(_n);
        System.out.println(String.valueOf(res));  

    }
}
