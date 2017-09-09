package cc.learnfly.exam.ofo;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main1 {


/*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^ 
******************************开始写代码******************************/
	static int GetAn(int a1, int a2, int a3, long n) {
		int out =0;

	   	return out;


    }
/******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
            
        int _a1;
        _a1 = Integer.parseInt(in.nextLine().trim());
        
        int _a2;
        _a2 = Integer.parseInt(in.nextLine().trim());
        
        int _a3;
        _a3 = Integer.parseInt(in.nextLine().trim());
        
        long _n;
        _n = Long.parseLong(in.nextLine().trim());
  
        res = GetAn(_a1, _a2, _a3, _n);
        System.out.println(String.valueOf(res));    

    }
}
