package cc.learnfly.exam.huawei;

import java.util.Scanner;

public class Huawei1 {
	public static void count(String str){
		if(str == null || str.length() == 0){
			System.out.println("0,0,0");
		}
		int n = str.length();
		int n1 = 0 , n2 = 0, n3  = 0;
		int type = 0;
		if(getType(str.charAt(0)) == 1){
			n1++;
			type = 1;
		}else if(getType(str.charAt(0)) == 2){
			n2++; type =2;
		}else{
			n3++; type = 3;
		}
		int i = 1;
		while(i < n){
			int newType = getType(str.charAt(i));
			if(newType != type){
				if(newType == 1){
					n1++;
					type = 1;
				}else if(newType == 2){
					n2++;
					type = 2;
				}else{
					n3++;
					type = 3;
				}
			}
			i++;
		}
		System.out.println(n1+","+n2+","+n3);
		
	}
	
	public static int getType(char c){
		if(c >= '0' && c <= '9'){
			return 2;
		}else if((c >= 'A' && c <= 'Z') ||( c >= 'a' && c <='z') ){
			return 1;
		}else{
			return 3;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			count(str);
		}
		scan.close();
		
	}

}
