package cc.learnfly.exam;

import java.util.Scanner;

/*
 * 读入一个字符串str，输出字符串str中的连续最长的数字串
输入描述:

个测试输入包含1个测试用例，一个字符串str，长度不超过255。



输出描述:

在一行内输出str中里连续最长的数字串。


输入例子:

abcd12345ed125ss123456789


输出例子:

123456789
 */
public class LongestDigitSubStr {
	
	public static void subDigitStr(String str){
		char[] ch = str.toCharArray();
		int bgeinIndex =0, endIndex = 0;
		int maxBegin = 0,maxEnd = 0;
		int i=0;
		while(i<ch.length){
			if(ch[i] >= '0' && ch[i]<='9'){
				bgeinIndex = i;
				endIndex = i;
				while(i < ch.length && ch[i] >= '0' && ch[i]<='9'){
					i++;
					endIndex++;
				}
				if((endIndex - bgeinIndex)>(maxEnd - maxBegin) ){
					maxBegin = bgeinIndex;
					maxEnd = endIndex;
				}
			}else{
				i++;
			}
		}
		for(int i1=maxBegin; i1<maxEnd;i1++){
			System.out.print(ch[i1]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			subDigitStr(str);
		}		
		scan.close();
	}

}
