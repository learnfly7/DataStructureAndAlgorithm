package cc.learnfly.exam;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }
/*    ArrayList<Integer> a1 = new ArrayList<>();
	ArrayList<Integer> a2 = new ArrayList<>();
	int index1 = p.indexOf("?");
	while(index1 !=-1){
		a1.add(index1);
		index1 = p.indexOf("?",index1);
	}
	int index2 = p.indexOf("*");
	while(index2 !=-1){
		a2.add(index2);
		index2 = p.indexOf("*",index2);
	}
	for(int i=0;i<str.length();i++){
		if(a1.contains(i)){
			
		}else if(a2.contains(i)){
			
		}else{
			
		}
	}*/

    // write your code here
    public static int resolve(String expr) {
    	char[] ch = expr.toCharArray();
    	int intNum = 0;
    	//用于标识不止一位的整数
    	int b=-1;
    	Stack<Integer> stack = new Stack<>();
    	for(int i=0;i<ch.length;i++){
    		if(ch[i]==' '){
    			b=-1;
    		}else if(ch[i]>='0' && ch[i]<= '9'){
    			if(intNum == 16){
    				return -2;
    			}else{
    				if(b!=-1){
    					//说明是一个连续的多位整数
    					int num = stack.pop();
    					stack.push(num*10+(ch[i]-'0'));
    					b=1;
    				}else{
    					stack.push(ch[i]-'0');
        				intNum++;
        				b=1;
    				}
    				
    			}    			
    		}else if(ch[i]=='^'){
    			if(stack.isEmpty()){
    				return -1;
    			}    			
    			int num = stack.pop();
    			++num;
    			stack.push(num);
    			b=-1;
    		}else if(ch[i] == '+'){
    			if(stack.isEmpty()){
    				return -1;
    			} 
    			int num1 = stack.pop();
    			if(stack.isEmpty()){
    				return -1;
    			} 
    			int num2 = stack.pop();
    			stack.push(num1 + num2);
    			b=-1;
    		}else if(ch[i] == '*'){
    			if(stack.isEmpty()){
    				return -1;
    			} 
    			int num1 = stack.pop();
    			if(stack.isEmpty()){
    				return -1;
    			} 
    			int num2 = stack.pop();
    			stack.push(num1 * num2);
    			b=-1;
    		}
    	}
    	if(stack.isEmpty()){
			return -1;
		}else{
			return stack.pop();
		} 
       
    }
}
