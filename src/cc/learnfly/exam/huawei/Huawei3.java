package cc.learnfly.exam.huawei;

import java.util.Scanner;

public class Huawei3 {
	
	public static void calculate(String str){
		if(str == null || str.length() == 0){
			return;
		}
		int i = 0;
		int lcount = 0;
		int lindex  = -1, rindex = -1;
		while( lindex == -1 || rindex == -1){
			if(i >= str.length()){
				break;
			}
			
			if(str.charAt(i) == ')' &&  lcount % 2 == 0){
				rindex = i;
				String exp = str.substring(lindex+1, rindex);
				String result = "";
				if(exp.indexOf("search") == 0){
					result = search(exp);
				}
				if(exp.indexOf("combine") == 0){
					result = combine(exp);
				}
				if(exp.indexOf("reverse") == 0){
					result = reverse(exp);
				}
				if(exp.indexOf("quote") == 0){
					result = quote(exp);
				}
				if(i >= str.length()-1){
					str = result;
					break;
				}else{
					str = str.substring(0,lindex) + result + str.substring(rindex+1);
					
					lindex = -1;rindex = -1 ; i = 0; lcount = 0;
				}
				
			}else{
				if(str.charAt(i) == '('){
					
					lindex = i;
				}
				if(str.charAt(i) == '\"'){
			
					lcount++;
				}
				i++;
			}		
			
		}
		
		System.out.println(str);
	}
	public static String search(String str){
		String[] strs = str.split("\"");
		int result = strs[1].indexOf(strs[3]);
		if(result != -1){
			return "\""+strs[1].substring(result)+"\"";
		}else{
			return "\"\"";
		}
	}
	
	public static String quote(String str){
		String[] strs = str.split("\"");
		return "\""+strs[1]+"\"";
	}
	
	public static String reverse(String str){
		String[] strs = str.split("\"");
		return "\""+new StringBuilder(strs[1]).reverse().toString()+"\"";
	}
	public static String combine(String str){
		String[] strs = str.split("\"");
		StringBuilder sb = new StringBuilder();
		for(int i = 1;i<strs.length;i++){
			if(!strs[i].equals("") && !strs[i].equals(" ")){
				sb.append(strs[i]);
			}
		}
		return "\""+sb.toString()+"\"";
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			calculate(str);
			
		}
        scan.close();
		
	}

}
