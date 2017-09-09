package cc.learnfly.exam.huawei;

import java.util.Scanner;

public class Huawei2 {
	
	public static void reverse(String str){
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			String[] strs = str.trim().split(" ");
			String newStr = "";
			for(int i = strs.length - 1 ; i >=0; i--){
				if(!strs[i].equals(" ") && !strs[i].equals("")){
					newStr += strs[i];
					if(i != 0){
						newStr += " ";
					}
				}
				
			}
			System.out.println(newStr);
			
		}
        scan.close();
		
	}

}
