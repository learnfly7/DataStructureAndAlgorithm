package cc.learnfly.exam.sohu;


import java.util.Scanner;

public class Sohu2 {
	
	public static void count(int n, int[] a){
		if(a[0] == 0 && a[1] == 0 && a[2] == 0 && a[3] == 0 && a[4] == 0 && a[5] == 0){
			return;
		}

		int number = a[5] + a[4] + a[3]; 

		if(a[2] % 4 == 0){
			number = number  + a[2] / 4;
		}else{
			number = number  + a[2] / 4 + 1;
		}
		

		
		int number2 = a[3] * 5 + a[a[2] % 4 ];  
        if(a[1] > number2){
        	number += (a[1] - number2 + 8) / 9;
        }
        	

        int number1 = number * 36 - a[5] * 36 - a[4] * 25 - a[3] * 16 - a[2] * 9 - a[1] * 4;
        if(a[0] > number1){
        	number += (a[0] -number1 + 35) / 36;
        }
        	
        System.out.println(number);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String[] strs = scan.nextLine().split(" ");
			int n = strs.length;
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = Integer.parseInt(strs[i]);
			}
			count(n, a);	
		}
			
				
		scan.close();

	}

}
