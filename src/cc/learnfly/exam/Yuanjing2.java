package cc.learnfly.exam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Yuanjing2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		find(str);
	}

	 public static void find(String str) {
		LinkedList<Character> list = new LinkedList<>();
		int n = str.length();
		int[] uppperIndex = new int[n];
		int j = 0;
		for(int i=0;i<n;i++){
			uppperIndex[i] = -1;
			char c = str.charAt(i);
			if(c>='A' && c<='Z'){
				uppperIndex[j] = i;
				j++;
			}
		}
		for(int i=  0;i<n;i++){
			char c = str.charAt(i);
			
			if((c >= 'a' && c<='z')||(c>='A' && c<='Z')){
				
				list.add(c);
			}
		}
		
		Collections.sort(list);
		int index = 0;
		StringBuilder sb=  new StringBuilder();
		for(int i=  0;i<n;i++){
			char c = str.charAt(i);
			if(!((c >= 'a' && c<='z')||(c>='A' && c<='Z'))){
				sb.append(str.substring(i, i+1));
			}else{
				sb.append(list.get(index));
				index++;
			}
		}
		System.out.println(sb.toString());
	        
	 }
}
